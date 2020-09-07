package com.aaa.service;

import com.aaa.dao.HouseDao_Y;
import com.aaa.dao.House_matingDao;
import com.aaa.entity.House_Y;
import com.aaa.entity.SearchInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseService_Y {
    @Resource
    HouseDao_Y houseDao_y;

    public PageInfo findAll(SearchInfo searchInfo,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<House_Y> list = houseDao_y.findAll(searchInfo);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public House_Y fingById(Integer hid){
        return houseDao_y.fingById(hid);
    }

    public House_Y selectById(Integer hid){
        return houseDao_y.selectByPrimaryKey(hid);
    }

    /*首页随机显示*/
    public List<House_Y> findFiveLimit(){
        return houseDao_y.findFiveLimit();
    }

    /*查询也注名下其他房源*/
    public List<House_Y> fingOthersHouse(Integer hid){
        return houseDao_y.fingOthersHouse(hid);
    }

    public Integer insert(House_Y house_y){
        int inadd=houseDao_y.insert(house_y);
        if(inadd>=1){
//             int inadd2= House_matingDao.insert()
        }
        return 0;
    }

    public Integer selectmax(){
        return houseDao_y.querymax();
    }

}
