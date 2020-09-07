package com.aaa.controller;

import com.aaa.entity.House_trouble;
import com.aaa.service.House_troubleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("house_trouble")
public class House_troubleController {
    @Resource
    private House_troubleService service;

    @RequestMapping(value = "selectAll",method = RequestMethod.POST)
    public List<House_trouble> selectAll(){
        return service.selectAll();
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public int insert(@RequestBody House_trouble house_trouble){
        return service.insert(house_trouble);
    }

    @RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.POST)
    public int deleteByPrimaryKey(@RequestBody Map<Object,Object> map){
        int trid = (int) map.get("id");
        return service.deleteByPrimaryKey(trid);
    }

    @RequestMapping(value = "updateByPrimaryKey",method = RequestMethod.POST)
    public int updateByPrimaryKey(@RequestBody House_trouble house_trouble){
        return service.updateByPrimaryKey(house_trouble);
    }
}
