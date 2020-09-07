package com.aaa.service;

import com.aaa.dao.Ad_photoDao;
import com.aaa.entity.Adphoto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Ad_photoService {
    @Resource
    private Ad_photoDao dao;

    public List<Adphoto> selectAll(){
        return dao.selectAll();
    }

    public int insert(Adphoto ad_photo){
        return dao.insert(ad_photo);
    }

    public int deleteByPrimaryKey(int adid){
        return dao.deleteByPrimaryKey(adid);
    }

    public int updateByPrimaryKey(Adphoto ad_photo){
        return dao.updateByPrimaryKey(ad_photo);
    }
}
