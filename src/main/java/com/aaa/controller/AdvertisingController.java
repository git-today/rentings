package com.aaa.controller;

import com.aaa.entity.Advertising;
import com.aaa.service.AdvertisingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("advertising")
public class AdvertisingController {

    @Resource
    private AdvertisingService service;

    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public List<Advertising> selectAll(){
        return service.selectAll();
    }
}
