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
    @RequestMapping("findAll")
    public PageInfo select(
            @RequestBody String data){
        SearchInfo searchInfo = JSONObject.parseObject(data, SearchInfo.class);

        System.out.println(searchInfo);
        return houseService_y.findAll(searchInfo,searchInfo.getPageNum(),searchInfo.getPageSize());
    }
}
