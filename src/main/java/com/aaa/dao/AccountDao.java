package com.aaa.dao;

import com.aaa.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AccountDao {
    //查询用户已认证的状态信息或用户未认证的状态信息
    @Select("select * from account where astate=#{astate} ")
    public List<Account> selectState(int astate);

    //修改为已认证用户或未认证
    @Update("update account set astate=#{astate} where aid=#{id} ")
    public int updateState(int astate,int id);
}
