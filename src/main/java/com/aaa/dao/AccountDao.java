package com.aaa.dao;

import com.aaa.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AccountDao extends tk.mybatis.mapper.common.Mapper<Account> {

    @Select("select aid as id,aphone,apwd,apost,astate,aname,anumber,aborth,adress,adescribe from account where aid=#{id} ")
    public List<Account> selectId(int id);

    @Insert("insert account(aphone,apwd,apost,astate,aname,anumber,aborth,adress,adescribe)\n" +
            "values(#{aphone},#{apwd},#{apost},#{astate},#{aname},#{anumber},#{aborth},#{adress},#{adescribe})")
    public int add(String aphone, String apwd, int apost, int astate, String aname, String anumber, String aborth, String adress, String adescribe);


    @Select("select * from account where aphone=#{aphone} and apwd=#{apwd} ")
    public List<Account> queryNamePwd(String aphone, String apwd);

    //查询用户已认证的状态信息或用户未认证的状态信息
    @Select("select * from account where astate=#{astate} ")
    public List<Account> selectState(int astate);

    //修改为已认证用户或未认证
    @Update("update account set astate=#{astate} where aid=#{id} ")
    public int updateState(int astate, int id);
}
