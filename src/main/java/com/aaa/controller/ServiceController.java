package com.aaa.controller;

import com.aaa.dao.ServiceDao;
import com.aaa.entity.Server;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("server")
public class ServiceController {
    @Resource
    ServiceDao serviceDao;

    @RequestMapping("findall")
    public List<Server> query(){
        return serviceDao.selectAll();
    }

    @RequestMapping("add")
    public int add(@RequestBody Server server){
        return serviceDao.insert(server);
    }

    @RequestMapping("findsah")
    public List<Map<String,Object>>  findsah(){
        return serviceDao.selectsah();
    }

}
