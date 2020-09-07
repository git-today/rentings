package com.aaa.service;

import com.aaa.dao.AccountDao;
import com.aaa.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.Column;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

    @Service
    public class AccountService {
        @Resource
        private AccountDao dao;


        //按房源查看传的编号查询对应的用户信息
        public List<Account> selectId(int id){
            return dao.selectId(id);
        }

        //注册
        public int insert(String aphone){
            Account t = new Account();
            t.setAphone(aphone);
            t.setApwd("123");
            t.setApost(0);
            t.setAstate(0);
            Date now=new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tablename=dateFormat.format(now);
            t.setAborth(tablename);
            System.out.println("注册时间："+tablename);
            t.setAname("张三");
            t.setAnumber("11111111111111");
            t.setAdress("河南郑州");
            t.setAdescribe("这是一些描述");
            return dao.add(t.getAphone(),t.getApwd(),t.getApost(),t.getAstate(),t.getAname(),t.getAnumber(),t.getAborth(),t.getAdress(),t.getAdescribe());
        }

        //登陆
        public List<Account> queryNamePwd(String aphone,String apwd){
            return dao.queryNamePwd(aphone,apwd);
        }

        //查询用户已认证的状态信息或用户未认证的状态信息
        public List<Account> selectState(int astate){
            List<Account> accounts = dao.selectState(astate);
            //状态判断赋值
            for (Account f : accounts){
                if (f.getAstate()==0){
                    f.setAstate(0);
                }else if (f.getAstate()==1){
                    f.setAstate(1);
                }
            }
            return accounts;
        }
    //修改为已认证用户或未认证
    public int updateState(int astate,int id){
        return dao.updateState(astate,id);
    }
}
