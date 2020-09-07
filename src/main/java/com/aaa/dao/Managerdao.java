package com.aaa.dao;

import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface Managerdao extends tk.mybatis.mapper.common.Mapper<Manager> {

    @Update("update manager set mgpwd=#{mgpwd} where mgid=#{mgid} ")
    int updateNamePwd(String mgpwd, Integer mgid);

    @Select("select * from manager where mgname=#{mgname} and mgpwd=mgpwd ")
    List<Manager> queryNamePwd(String mgname, String mgpwd);

    @Select("select m.mgid,m.mgname,m.mgpwd,m.role_id,r.role_name,m.mgstate " +
            "from manager m join role r on m.role_id=r.role_id " +
            "where m.mgname=#{mgname} and m.mgpwd=#{mgpwd}")
    Manager login(Manager manager);

    Integer mupdate(Manager manager);

    @Delete("delete from manager where mgid=#{mgid}")
    Integer mdelete(Integer mgid);

    Integer minsert(Manager manager);

    List<Manager> query(String mgname, String mgpwd);

    List<Manager> querylikeSearch(String mgname);

    int queryByname(String mgname);

    List<Manager>queryid(Integer mgid);

    @Select("select count(mgid) from manager")
    Integer count();

    Manager checkUserName(String s);
}
