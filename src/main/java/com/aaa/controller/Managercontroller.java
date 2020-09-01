package com.aaa.controller;

import com.aaa.dao.Managerdao;
import com.aaa.dao.Menudao;
import com.aaa.entity.Manager;
import com.aaa.service.Managerservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("manager")
public class Managercontroller {
    @Resource
    Managerdao managerdao;
    @Resource
    Managerservice managerservice;
    @Resource
    Menudao menudao;

    @RequestMapping("/login")
    @ResponseBody
    public List<Map<String,Object>> login(@RequestBody Manager manager){
        List<Map<String,Object>> u=managerdao.login(manager);
        System.out.println("u:"+u);
        if(u !=null){
            return u;
        }else{
            return null;
        }
    }

    @RequestMapping("/query")
    @ResponseBody
    public List<Map<String,Object>> query(){
        List<Map<String,Object>> u=managerdao.select1();
//        System.out.println(u);
        if(u !=null){
            return u;
        }else{
            return null;
        }
    }

    @RequestMapping("updateFlag")
    @ResponseBody
    public Integer updateFlag(@RequestBody Manager manager){
        return managerdao.updateFlag(manager.getMgstate(),manager.getMgid());
    }

    @RequestMapping("mupdate")
    @ResponseBody
    public Integer mupdate(@RequestBody Manager manager){
        System.out.println(manager.toString());
        return managerdao.mupdate(manager.getMgpwd(),manager.getMgid());
    }

    @RequestMapping("minsert")
    @ResponseBody
    public Integer minsert(@RequestBody  Manager manager){
        return managerdao.insert(manager);
    }

    @RequestMapping("mdelete")
    @ResponseBody
    public Integer mdelete(Integer mgid){
        return managerdao.mdelete(mgid);
    }

}
