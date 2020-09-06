package com.aaa.service;

import com.aaa.dao.AdvertisingDao_Y;
import com.aaa.entity.Advertising_Y;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdvertisingService_Y {
    @Resource
    AdvertisingDao_Y advertisingDao_y;

    public List<Advertising_Y> findLimit(){
        return advertisingDao_y.findLimit();
    }
}
