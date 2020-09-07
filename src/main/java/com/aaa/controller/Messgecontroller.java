package com.aaa.controller;

import com.aaa.dao.Managerdao;
import com.aaa.entity.Manager;
import com.aaa.util.SendSms;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("users")
public class Messgecontroller {

    @Resource
    Managerdao managerdao;

    @RequestMapping("login")
    @ResponseBody
    public List<Manager> login(@RequestBody  Manager manager){
        return managerdao.query(manager.getMgname(),manager.getMgpwd());
    }

    @RequestMapping("register")
    @ResponseBody
    public Map<String, Object> to(@RequestBody String phone){
        Map<String, Object> up=SendSms.verify(phone);
        System.out.println(up);
        return up;
    }
}
