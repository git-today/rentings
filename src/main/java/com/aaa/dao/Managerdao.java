package com.aaa.dao;

import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface Managerdao extends tk.mybatis.mapper.common.Mapper<Manager>{
    @Select("select m.mgid,m.mgname,m.mgpwd,m.role_id,r.role_name,m.mgstate " +
            "from manager m join role r on m.role_id=r.role_id " +
            "where m.mgname=#{mgname} and m.mgpwd=#{mgpwd}")
    List<Map<String,Object>> login(Manager manager);
    @Update("update manager set mgpwd=#{mgpwd} where mgid =#{mgid}")
    Integer mupdate(String mgpwd,Integer mgid);

    @Update("update manager set mgstate=#{mgstate} where mgid=#{mgid}")
    Integer updateFlag(Integer mgstate, Integer mgid);

    @Delete("delete from manager where mgid=#{mgid}")
    Integer mdelete(Integer mgid);

//    @Insert("insert into manager values(mgid=#{mgid},mgname=#{mgname},mgpwd=#{mgpwd},role_id=1,mgstate=0")
//    Integer minsert(Manager manager);

    @Select("select m.mgid,m.mgname,m.mgpwd,m.role_id,r.role_name,m.mgstate " +
            "from manager m join role r on m.role_id=r.role_id ")
    List<Map<String,Object>>  select1();

    List<Manager> query(String mgname, String mgpwd);

    List<Manager> querylikeSearch(String mgname);

    int queryByname(String mgname);

    List<Manager>queryid(Integer mgid);

    @Select("select count(mgid) from manager")
    Integer count();
}
