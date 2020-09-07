package com.aaa.controller;

import com.aaa.dao.AdphotoDao;
import com.aaa.entity.Adphoto;
import com.aaa.service.AdphotoService;
import com.aaa.util.uploadfile.Testfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "adphoto",produces = { "application/json;charset=UTF-8" })
public class AdphotoController {
    @Resource
    AdphotoService adphotoService;
    @Resource
    AdphotoDao adphotoDao;

    @RequestMapping("findBigPhoto")
    public List<Adphoto> findBigPhoto(){
        return adphotoService.findBidPhoto();
    }

    @RequestMapping("find")
    public List<Adphoto> find(){
        return adphotoDao.selectAll();
    }

    @RequestMapping("insertadphoto")
    public int insertprograminfo(@RequestParam("file") MultipartFile file, Integer phototype){
        String photourl= "";
        try{
            File files=Testfile.multipartFileToFile(file);
            photourl=Testfile.uploadfile(files);
        }catch (Exception error){
            error.printStackTrace();
        }
        Adphoto adphoto=new Adphoto();
        adphoto.setAdphoto("https://renting-1303033920.cos.ap-shanghai.myqcloud.com/"+photourl);
        adphoto.setPhototype(phototype);
        System.out.println(adphoto);
        return adphotoService.insertPhoto(adphoto);
    }
}
