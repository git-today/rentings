package com.aaa.service;

import com.aaa.dao.AdvertisingDao;
import com.aaa.entity.Advertising;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdvertisingService {
    @Resource
    private AdvertisingDao dao;

    public List<Advertising> selectAll(){
        return dao.selectAll();
    }
}
