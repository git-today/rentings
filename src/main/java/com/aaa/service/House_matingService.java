package com.aaa.service;

import com.aaa.dao.House_matingDao;
import com.aaa.entity.House_mating;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class House_matingService {
    @Resource
    private House_matingDao dao;

    public List<House_mating> selectAll(){
        return dao.selectAll();
    }

    public List<House_mating> selectId(int htid){
        return dao.selectId(htid);
    }

//    public int delete(){
////        return dao.delete();
////    }


}
