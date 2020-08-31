package com.aaa.dao;

import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface Managerdao extends tk.mybatis.mapper.common.Mapper<Manager> {

    @Update("update manager set mgpwd=#{mgpwd} where mgid=#{mgid} ")
    int updateNamePwd(String mgpwd,Integer mgid);

    @Select("select * from manager where mgname=#{mgname} and mgpwd=mgpwd ")
    List<Manager> queryNamePwd(String mgname, String mgpwd);
    List<Manager> querySearch(String mgname);
    List<Manager> querylikeSearch(String mgname);
    int queryBynameandpwd(String mgname, String mgpwd);

    int queryByname(String mgname);
    int doadd(Manager manager);
    int doupd(Manager manager);
    List<Manager>query();
    List<Manager>queryid(Integer mgid);

    int count();
}
