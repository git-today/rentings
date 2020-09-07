package com.aaa.service;

import com.aaa.dao.AccountDao;
import com.aaa.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {
    @Resource
    private AccountDao dao;

    //查询用户已认证的状态信息或用户未认证的状态信息
    public List<Account> selectState(int astate){
        return dao.selectState(astate);
    }

    //修改为已认证用户或未认证
    public int updateState(int astate,int id){
        return dao.updateState(astate,id);
    }
}
