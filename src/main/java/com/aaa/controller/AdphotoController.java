package com.aaa.controller;

import com.aaa.dao.AdphotoDao;
import com.aaa.entity.Adphoto;
import com.aaa.service.AdphotoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "adphoto",produces = { "application/json;charset=UTF-8" })
public class AdphotoController {
    @Resource
    AdphotoService adphotoService;
    @RequestMapping("findBigPhoto")
    public List<Adphoto> findBigPhoto(){
        return adphotoService.findBidPhoto();
    }
}
