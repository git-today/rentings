package com.aaa.controller;

import com.aaa.util.uploadfile.TencentCOS;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.aaa.util.uploadfile.TencentCOS.deletefile;

/*腾讯云对象存储 文件上传*/
@CrossOrigin
@Controller
@RequestMapping(value = "upload", produces = {"application/json;charset=UTF-8"})
public class UploadImgController {

    /*@RequestMapping("/uploadImage")
    public String upload(@RequestParam("file") MultipartFile multfile, Map<String,Object> map)throws Exception{
        // 获取文件名
        String fileName = multfile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        // 用uuid作为文件名，防止生成的临时文件重复
        final File excelFile = File.createTempFile("imagesFile-"+System.currentTimeMillis(), prefix);
        // 将MultipartFile转为File
        multfile.transferTo(excelFile);

        //调用腾讯云工具上传文件
        String uploadfile = TencentCOS.uploadfile(excelFile);
        /*
        //*//*/程序结束时，删除临时文件
        TencentCOS.deletefile(excelFile);*//*
        //存入图片名称，用于网页显示
        map.put("imageName",fileName);
        //返回图片名称
        return "index";
    }*/
    @ResponseBody
    @RequestMapping("test")
    public String test(@RequestParam("photo") MultipartFile photo, Map<String,Object> map) throws IOException {
        System.out.println(photo);
        System.out.println(photo.getContentType());
        System.out.println(photo.getSize());
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getName());
        System.out.println(map);
        File file = new File("D:\\rentinIMG\\",photo.getOriginalFilename());
        photo.transferTo(file);
        String result = TencentCOS.uploadfile(file);
        return result;
    }
}
