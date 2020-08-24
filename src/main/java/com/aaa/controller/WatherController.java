package com.aaa.controller;

import com.aaa.util.wather.MyWatherUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.SocketException;
@CrossOrigin
@Controller
@RequestMapping(value = "wather",produces = { "application/json;charset=UTF-8" })
public class WatherController {
    @ResponseBody
    @RequestMapping("getWather")
    public String getWather() throws SocketException {
        MyWatherUtil myWatherUtil = new MyWatherUtil();
        return myWatherUtil.getWather();
    }

}
