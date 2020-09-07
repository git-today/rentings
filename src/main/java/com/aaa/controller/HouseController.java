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

//    //前台用户自己添加房源的方法
//    @RequestMapping(value = "insert",method = RequestMethod.POST)
//    public int insert(@RequestBody House house){
//        return service.insert(house);
//    }

    //后台删除房源方法
    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.POST)
    public int deleteByPrimaryKey(@RequestBody House house){
        Integer hid = house.getHid();
        //房源配套表
        Integer htid = house.getHtid();
        //用户表
//        Integer aid = house.getAid();
        //房源图片表
        String hpid = house.getHpid();
        System.out.println("hid:"+hid);
        System.out.println("htid:"+htid);
        System.out.println("hpid:"+hpid);
        return 1;
    }

    //用于待付款传值跳页面
//    @RequestMapping("obligation")
//    public String obligation(HttpServletRequest req,ModelMap m,String ro_id,double ro_rate){
//        //创建一个session
//        HttpSession session=req.getSession();
//        //把session对象传入订单房间编号
//        session.setAttribute("ro_id", ro_id);
//
//        m.addAttribute("ro_id",ro_id);
//        m.addAttribute("ro_rate",ro_rate);
//        return "../pay";
//    }

    //修改方法
    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody House house){
        return service.updateByPrimaryKey(house);
    }
}
