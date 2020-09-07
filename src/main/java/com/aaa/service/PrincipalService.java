package com.aaa.service;

import com.aaa.dao.PrincipalDao;
import com.aaa.entity.Principal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrincipalService {
    @Resource
    private PrincipalDao dao;

    public List<Principal> selectAll(){
        return dao.selectAll();
    }

    public int insert(Principal principal){
        return dao.insert(principal);
    }

    public int deleteByPrimaryKey(String pmanager){
        return dao.deleteByPrimaryKey(pmanager);
    }

    public int updateByPrimaryKey(Principal principal){
        return dao.updateByPrimaryKey(principal);
    }
}
