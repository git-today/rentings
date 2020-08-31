package com.aaa.dao;

import com.aaa.entity.House_mating;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface House_matingDao {
    @Select("select * from house_mating")
    public List<House_mating> selectAll();

    @Delete("")
    public int delete();

    @Update("")
    public int update();
}
