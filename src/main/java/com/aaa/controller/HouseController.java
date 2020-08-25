package com.aaa.controller;

import com.aaa.dao.HouseDao;
import com.aaa.entity.House;
import com.aaa.service.HouseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("house")
public class HouseController {

    @Resource
    HouseService service;

    //后台显示房源信息方法
    @RequestMapping(value="selectAll",method = RequestMethod.POST)
    public PageInfo selectAll(@RequestBody Map<Object,Object> map){
        int pageNum = (int) map.get("pageNum");
        int pageSize = (int) map.get("pageSize");
        return service.selectAll(pageNum,pageSize);
    }

    //前台用户自己添加房源的方法
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public int insert(@RequestBody House house){
        return service.insert(house);
    }

    //删除方法
    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.POST)
    public int deleteByPrimaryKey(@RequestBody Map<Object,Object> map){
        Integer hid = (Integer) map.get("hid");
        return service.deleteByPrimaryKey(hid);
    }

    //修改方法
    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody House house){
        return service.updateByPrimaryKey(house);
    }
}
