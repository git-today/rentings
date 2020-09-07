package com.aaa.controller;

import com.aaa.dao.Managerdao;
import com.aaa.dao.Menudao;
import com.aaa.entity.Manager;
import com.aaa.service.ManagerService;
import com.aaa.util.SendSms;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("manager")
public class ManagerController {

    @Resource
    private ManagerService service;

    @Resource
    private Managerdao managerdao;

//    @Resource
//    Managerdao managerdao;
//    @Resource
//    Menudao menudao;

    //修改管理员密码
    @RequestMapping(value = "updateNamePwd",method = RequestMethod.POST)
    public int updateNamePwd(@RequestBody Map<Object,Object> map){
        String mgpwd = (String) map.get("mgpwd");
        Integer mgid = (Integer) map.get("mgid");
        System.out.println("密码："+mgpwd+"id："+mgid);
        int res = service.updateNamePwd(mgpwd, mgid);
        System.out.println("执行条数：:"+res);
        return res;
    }

    //登录的账号密码查询
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public List<Manager> login(@RequestBody Manager manager){
        String mgname = manager.getMgname();
        String mgpwd = manager.getMgpwd();
        List<Manager> u=managerdao.queryNamePwd(mgname,mgpwd);
        System.out.println("u:"+u);
        if(u !=null){
            return u;
        }else{
            return null;
        }
    }

    @RequestMapping(value = "query",method = RequestMethod.POST)
    public List<Manager> query(){
        List<Manager> u=managerdao.selectAll();
        if(u !=null){
            return u;
        }else{
            return null;
        }
    }

    @RequestMapping(value = "minsert",method = RequestMethod.POST)
    public Integer minsert(@RequestBody Manager manager){
        return managerdao.minsert(manager);
    }

    @RequestMapping(value = "mdelete",method = RequestMethod.POST)
    public Integer mdelete(@RequestBody Integer mid){
        return managerdao.mdelete(mid);
    }

}
