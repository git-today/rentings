package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {

    @RequestMapping("find")
    @ResponseBody
    public String test1(){
        return "success";
    }

    @RequestMapping("find2")
    @ResponseBody
    public String test2(){
        return "filed";
    }
}
