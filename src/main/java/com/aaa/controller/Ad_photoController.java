package com.aaa.controller;

import com.aaa.entity.Adphoto;
import com.aaa.service.Ad_photoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("ad_photo")
public class Ad_photoController {
    @Resource
    private Ad_photoService service;

    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public List<Adphoto> selectAll(){
        return service.selectAll();
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public int insert(@RequestBody Adphoto ad_photo){
        return service.insert(ad_photo);
    }

    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.POST)
    public int deleteByPrimaryKey(@RequestBody Map<Object,Object> map){
        int adid = (int) map.get("adid");
        return service.deleteByPrimaryKey(adid);
    }

    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody Adphoto ad_photo){
        return service.updateByPrimaryKey(ad_photo);
    }

}
