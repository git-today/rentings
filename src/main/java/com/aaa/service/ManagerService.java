package com.aaa.service;

import com.aaa.dao.Managerdao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManagerService {

    @Resource
    private Managerdao dao;

    public int updateNamePwd(String mgpwd,Integer mgid){
        return dao.updateNamePwd(mgpwd,mgid);
    }

}
