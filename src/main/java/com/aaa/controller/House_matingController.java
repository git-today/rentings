package com.aaa.controller;

import com.aaa.entity.House_mating;
import com.aaa.service.House_matingService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("house_mating")
public class House_matingController {
    @Resource
    private House_matingService service;

    //按房源查看传的编号查询对应的房源配套信息
    @RequestMapping(value = "selectId",method = RequestMethod.POST)
    public List<House_mating> selectId(@RequestBody Map<Object,Object> map){
        int htid = (int) map.get("htid");
//        System.out.println("htid:"+service.selectId(htid));
        return service.selectId(htid);
    }


    //查询所有房源配套
    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public PageInfo selectAll(@RequestBody Map<Object,Object> map){
        int pageNum = (int) map.get("pageNum");
        int pageSize = (int) map.get("pageSize");
        return service.selectAll(pageNum,pageSize);
    }

    //修改房源配套
    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody House_mating house_mating){
        return service.updateByPrimaryKey(house_mating);
    }


}
