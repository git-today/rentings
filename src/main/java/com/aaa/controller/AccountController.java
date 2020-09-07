package com.aaa.controller;

import com.aaa.dao.Managerdao;
import com.aaa.dao.Menudao;
import com.aaa.entity.Account;
import com.aaa.entity.Manager;
import com.aaa.service.AccountService;
import com.aaa.util.SendSms;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("account")
class AccountController {
    @Resource
    private AccountService service;

//    @RequestMapping(value = "pay",method = RequestMethod.GET)
//    public String pay(){
//        System.out.println("pay");
//        return "/pay";
//    }

    //按房源查看传的编号查询对应的用户信息
    @RequestMapping(value = "selectId",method = RequestMethod.POST)
    @ResponseBody
    public List<Account> selectId(@RequestBody Map<Object,Object> map){
        int id = (int) map.get("id");
        return service.selectId(id);
    }

    @RequestMapping(value = "phone",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> phone(@RequestBody Map<Object,Object> map){
        String aphone = (String) map.get("aphone");
        Map<String, Object> verify = SendSms.verify(aphone);
        System.out.println("验证码："+verify);
        return verify;
    }

    //登陆
    @RequestMapping(value = "queryNamePwd",method = RequestMethod.POST)
    @ResponseBody
    public List<Account> queryNamePwd(@RequestBody Account account){
        String aphone = account.getAphone();
        String apwd = account.getApwd();
        return service.queryNamePwd(aphone,apwd);
    }

    //注册
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ResponseBody
    public int insert(@RequestBody Map<Object,Object> map){
        String aphone = (String) map.get("aphone");
        return service.insert(aphone);
    }


    //查询用户已认证的状态信息或用户未认证的状态信息
    @RequestMapping(value = "selectState",method = RequestMethod.POST)
    @ResponseBody
    public List<Account> selectState(@RequestBody Map<Object,Object> map){
        int astate= (int) map.get("astate");
        return service.selectState(astate);
    }

    //修改为已认证用户或未认证
    @RequestMapping(value = "updateState",method = RequestMethod.POST)
    @ResponseBody
    public int updateState(@RequestBody Map<Object,Object> map){
        int id= (int) map.get("id");
        int astate= (int) map.get("astate");
        return service.updateState(astate,id);
    }
}
