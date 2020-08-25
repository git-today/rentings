package com.aaa.controller;

import com.aaa.dao.Managerdao;
import com.aaa.entity.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("test")
public class Testcontroller {

    @Resource
    Managerdao managerdao;

    @RequestMapping("/login")
    @ResponseBody
    public List<Manager> login(@RequestBody Manager manager){
        List<Manager> u=managerdao.select(manager);
        if(u !=null){
            return u;
        }else{
            return null;
        }
    }

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
