package com.aaa.service;

import com.aaa.dao.HouseDao_Y;
import com.aaa.entity.House_Y;
import com.aaa.entity.SearchInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseService_Y {
    @Resource
    HouseDao_Y houseDao_y;

    public PageInfo findAll(SearchInfo searchInfo,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<House_Y> list = houseDao_y.findAll(searchInfo);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;

    }
}
