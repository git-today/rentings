package com.aaa.dao;

import com.aaa.entity.House_mating;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface House_matingDao extends tk.mybatis.mapper.common.Mapper<House_mating>{
    @Select("select * from house_mating")
    public List<House_mating> selectAll();

    @Select("select htid as id,htype,htdirect,htbed,htcar,htweb,htv,htwashing,htheating,htait,htrfrt,htheater,hfloor,hfloors from house_mating where htid=#{htid} ")
    public List<House_mating> selectId(int htid);


    @Select("select * from house_mating order by htid DESC LIMIT 0,1")
    int querymax();
//    @Delete("")
//    public int delete();
//
//    @Update("")
//    public int update();
}
