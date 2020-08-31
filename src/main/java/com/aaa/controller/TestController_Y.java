package com.aaa.controller;

import com.aaa.dao.HouseDao_Y;
import com.aaa.entity.House_Y;
import com.aaa.entity.SearchInfo;
import com.aaa.entity.Test_Y;
import com.aaa.service.HouseService_Y;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Controller
@RequestMapping(value = "ty",produces = { "application/json;charset=UTF-8" })
public class TestController_Y {
    @Resource
    HouseDao_Y houseDao_y;
    @ResponseBody
    @RequestMapping("t")
    public Object test(
            /*@RequestBody Test_Y test_y*/
            /*@RequestBody  String data*/
            /*@RequestBody Test_Y test_y,*/
            @RequestBody @RequestParam(value = "searchInfo",required = false) SearchInfo searchInfo,
            @RequestBody @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
            @RequestBody @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize
    ){
        System.out.println(searchInfo);
        System.out.println(pageNum+"-----"+pageSize);

        /*System.out.println(test_y);*/

        /*System.out.println(data);
        JSONObject jsonObject = JSONObject.parseObject(data);
        Object o = jsonObject.get("test_y");
        System.out.println(o);
        Integer pageNum = jsonObject.getInteger("pageNum");
        Integer pageSize = jsonObject.getInteger("pageSize");
        System.out.println(pageNum);
        System.out.println(pageSize);*/

        /*System.out.println(test_y);
        System.out.println(pageNum+"-----"+pageSize);*/
        return  1;
    }



}
