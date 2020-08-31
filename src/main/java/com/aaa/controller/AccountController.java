package com.aaa.controller;

import com.aaa.entity.Account;
import com.aaa.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("account")
public class AccountController {
    @Resource
    private AccountService service;

    @RequestMapping(value = "selectState",method = RequestMethod.POST)
    public List<Account> selectState(@RequestBody Map<Object,Object> map){
        int astate= (int) map.get("astate");
        return service.selectState(astate);
    }

    @RequestMapping(value = "updateState",method = RequestMethod.POST)
    public int updateState(@RequestBody Map<Object,Object> map){
        int id= (int) map.get("id");
        int astate= (int) map.get("astate");
        return service.updateState(astate,id);
    }
}
