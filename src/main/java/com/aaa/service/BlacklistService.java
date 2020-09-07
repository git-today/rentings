package com.aaa.service;

import com.aaa.dao.BlacklistDao;
import com.aaa.entity.Blacklist;
import com.sun.deploy.util.BlackList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlacklistService {
    @Resource
    private BlacklistDao dao;

    public List<Blacklist> selectAll(){
        return dao.selectAll();
    }

    public int insert(Blacklist blacklist){
        return dao.insert(blacklist);
    }

    public int deleteByPrimaryKey(int bid){
        return dao.deleteByPrimaryKey(bid);
    }

    public int updateByPrimaryKey(Blacklist blacklist){
        return dao.updateByPrimaryKey(blacklist);
    }
}
