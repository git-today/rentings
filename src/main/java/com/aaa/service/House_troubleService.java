package com.aaa.service;

import com.aaa.dao.House_troubleDao;
import com.aaa.entity.House_trouble;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class House_troubleService {
    @Resource
    private House_troubleDao dao;

    public List<House_trouble> selectAll(){
        return dao.selectAll();
    }

    public int insert(House_trouble house_trouble){
        return dao.insert(house_trouble);
    }

    public int deleteByPrimaryKey(int trid){
        return dao.deleteByPrimaryKey(trid);
    }

    public int updateByPrimaryKey(House_trouble house_trouble){
        return dao.updateByPrimaryKey(house_trouble);
    }
}
