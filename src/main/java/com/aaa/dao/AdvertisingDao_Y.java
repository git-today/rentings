package com.aaa.dao;

import com.aaa.entity.Advertising_Y;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdvertisingDao_Y extends tk.mybatis.mapper.common.Mapper<Advertising_Y> {

    List<Advertising_Y> findLimit();
    /*List<Adphoto_Y> findById();*/
}
