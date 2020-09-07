package com.aaa.controller;

import com.aaa.entity.Blacklist;
import com.aaa.service.BlacklistService;
import jdk.nashorn.internal.ir.LiteralNode;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("blacklist")
public class BlackListController {
    @Resource
    private BlacklistService service;

    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public List<Blacklist> selectAll(){
        return service.selectAll();
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public int insert(@RequestBody Blacklist blacklist){
        return service.insert(blacklist);
    }

    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.POST)
    public int deleteByPrimaryKey(@RequestBody Map<Object,Object> map){
        int bid = (int) map.get("bid");
        return service.deleteByPrimaryKey(bid);
    }

    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody Blacklist blacklist){
        return service.updateByPrimaryKey(blacklist);
    }




}
