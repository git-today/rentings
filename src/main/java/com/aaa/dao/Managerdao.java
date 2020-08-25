package com.aaa.dao;

import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Managerdao extends tk.mybatis.mapper.common.Mapper<Manager>{
    @Select("select mgid,mgname,mgpwdfrom manager where mgname=#{mgname} and mgpwd=#{mgpwd}")
    Manager login(Manager manager);

    List<Manager> query(String mgname, String mgpwd);
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
