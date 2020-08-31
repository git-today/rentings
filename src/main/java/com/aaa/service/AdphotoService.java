package com.aaa.service;

import com.aaa.dao.AdphotoDao;
import com.aaa.entity.Adphoto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdphotoService {

    @Resource
    AdphotoDao adphotoDao;

    public List<Adphoto> findBidPhoto(){
        return adphotoDao.findBidPhoto();
    }
}
