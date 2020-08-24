package com.aaa.controller;

import com.aaa.util.wather.MyWatherUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.SocketException;
@CrossOrigin
@RestController
@RequestMapping(value = "wather",produces = { "application/json;charset=UTF-8" })
public class WatherController {

    @RequestMapping("getWather")
    public Object getWather() throws SocketException {
        MyWatherUtil myWatherUtil = new MyWatherUtil();
        JSONObject jsonObject = JSONObject.parseObject(myWatherUtil.getWather());
        return jsonObject;
    }
}
