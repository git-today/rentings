package com.aaa.controller;

import com.aaa.entity.Principal;
import com.aaa.service.PrincipalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("principal")
public class PrincipalController {
    @Resource
    private PrincipalService service;

    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public List<Principal> selectAll(){
        return service.selectAll();
    }

    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody Principal principal){
        return service.updateByPrimaryKey(principal);
    }
}
