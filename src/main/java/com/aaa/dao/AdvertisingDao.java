package com.aaa.dao;

import com.aaa.entity.Advertising;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface AdvertisingDao {

    @Select("select * from advertising ")
    public List<Advertising> selectAll();
}
