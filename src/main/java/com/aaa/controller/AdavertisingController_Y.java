package com.aaa.controller;

import com.aaa.entity.Advertising_Y;
import com.aaa.service.AdvertisingService_Y;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "av",produces = { "application/json;charset=UTF-8" })
public class AdavertisingController_Y {
    @Resource
    AdvertisingService_Y advertisingService_Y;

    @RequestMapping("findLimit")
    public List<Advertising_Y> findLimit(){
        return advertisingService_Y.findLimit();
    }
}
