package com.aaa.controller;

import com.aaa.entity.SearchInfo;
import com.aaa.service.HouseService_Y;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "houseShow",produces = { "application/json;charset=UTF-8" })
public class HouseShowController {
    @Resource
    HouseService_Y houseService_y;
    @Resource
    House_matingDao house_matingDao;
    @Resource
    HousephotoDao_Y housephotoDao_y;
    @Resource
    ServiceDao serviceDao;

    @RequestMapping("findAll")
    public PageInfo select(
            @RequestBody String data){
        SearchInfo searchInfo = JSONObject.parseObject(data, SearchInfo.class);

        System.out.println(searchInfo);
        return houseService_y.findAll(searchInfo,searchInfo.getPageNum(),searchInfo.getPageSize());
    }

    @RequestMapping("time")
    public int js(@RequestBody  String htime) throws ParseException {
        System.out.println(htime.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date smdate = sdf.parse(sdf.format(new Date()));
        System.out.println(smdate);
         Date bdate = sdf.parse(htime);
        System.out.println(bdate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days+1));
//        return 0;
    }

    @RequestMapping("insertinto")
    public int insert(@RequestParam("file") MultipartFile file,String  harea,String  hcommunity,String  htshi,String  hting,
                      String  htwei,String  hmode,Double  hprice,String  hspace,String  hpaymethod,String  hlabel,String  htime,
                      String  hadress,String  udescribe,Integer hstate,Integer aid,String  htype,String  htdirect,Integer htbed,
                      Integer htcar,Integer htweb,Integer htv,Integer htwashing,Integer htheating,Integer htait,Integer htrfrt,
                      Integer htheater,String  hfloor,String  hfloors,Double sprice){
        String photourl= "";
        int r=0;
        try{
            File files= Testfile.multipartFileToFile(file);
            photourl=Testfile.uploadfile(files);
        }catch (Exception error){
            error.printStackTrace();
        }
        House_photo_Y house_photo_y=new House_photo_Y();
        house_photo_y.setHphoto("https://renting-1303033920.cos.ap-shanghai.myqcloud.com/"+photourl);
        house_photo_y.setHid(houseService_y.selectmax()+1);
        int hp=housephotoDao_y.insert(house_photo_y);

        House_Y house_y=new House_Y();
        house_y.setHarea(harea);
        house_y.setHcommunity(hcommunity);
        house_y.setHcommunity(hcommunity);
        house_y.setHadress(harea);
        house_y.setAid(aid);
        house_y.setHlabel(hlabel);
        house_y.setHmode(hmode);
        house_y.setHpaymethod(hpaymethod);
        house_y.setHprice(hprice);
        house_y.setHspace(hspace);
        house_y.setHstate(hstate);
        house_y.setHpid("0");
        house_y.setHtid(house_matingDao.querymax()+1);
        house_y.setHtime(htime);
        house_y.setHting(hting);
        house_y.setHtshi(htshi);
        house_y.setHtwei(htwei);
        house_y.setUdescribe(udescribe);
        int h=houseService_y.insert(house_y);

        House_mating house_mating=new House_mating();
        house_mating.setHtype(htype);
        house_mating.setHtdirect(htdirect);
        house_mating.setHtweb(htweb);
        house_mating.setHtbed(htbed);
        house_mating.setHtv(htv);
        house_mating.setHtcar(htcar);
        house_mating.setHtheater(htheater);
        house_mating.setHtheating(htheating);
        house_mating.setHtait(htait);
        house_mating.setHtrfrt(htrfrt);
        house_mating.setHtwashing(htwashing);
        house_mating.setHfloor(hfloor);
        house_mating.setHfloors(hfloors);
        int hm=house_matingDao.insert(house_mating);

        Server server=new Server();
        server.setHid(houseService_y.selectmax()+1);
        server.setAid(aid);
        server.setSprice(sprice);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        server.setSrtime( sdf.format(new Date()));
        int sr=serviceDao.insert(server);
        System.out.println(house_y);
        if(h>=1 && hm>=1 && hp>=1 && sr>=1){
            r=1;
        }else{
            r=0;
        }
        return r;
    }

    @RequestMapping("findById")
    public House_Y findById(Integer hid){
        return houseService_y.fingById(hid);
    }

    @RequestMapping("selectById")
    public House_Y selectById(Integer hid){
        return houseService_y.selectById(hid);
    }

    @RequestMapping("findLimit")
    public List<House_Y> findLimit(){
        return houseService_y.findFiveLimit();
    }

    @RequestMapping("fingOthersHouse")
    public List<House_Y> fingOthersHouse(Integer hid){
        System.out.println(houseService_y.fingOthersHouse(hid));
        return houseService_y.fingOthersHouse(hid);
    }
}
