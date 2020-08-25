package com.aaa.service;

import com.aaa.dao.HouseDao;
import com.aaa.entity.House;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseService {
    @Resource
    private HouseDao dao;

    //显示房源信息
    public PageInfo<House> selectAll(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<House> houses = dao.selectAll();
        PageInfo<House> pageInfo = new PageInfo<House>(houses);
        return pageInfo;
    }

    //添加房源信息
    public int insert(House house){
        return dao.insert(house);
    }

    //删除房源信息
    public int deleteByPrimaryKey(Object o){
        return dao.deleteByPrimaryKey(o);
    }

    //修改房源信息
    public int updateByPrimaryKey(House house){
        return dao.updateByPrimaryKey(house);
    }
}
