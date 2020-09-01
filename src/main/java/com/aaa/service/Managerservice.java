package com.aaa.service;

import com.aaa.dao.Managerdao;
import com.aaa.entity.Manager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Managerservice {
    @Resource
    Managerdao managerdao;

    /**
     * 校验用户名
     *
     */
    public Manager checkUserName(String name){
        Manager user=new Manager();
        user.setMgname(name);
        return managerdao.selectOne(user);
    }

    /**
     * 启用禁用用户
     */
    public int updateFlag(@Param("mgstate") Integer mgstate, @Param("mgid") Integer mgid){
        return  managerdao.updateFlag(mgstate,mgid);
    }
}
