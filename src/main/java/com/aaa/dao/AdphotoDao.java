package com.aaa.dao;

import com.aaa.entity.Adphoto;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface AdphotoDao extends Mapper<Adphoto> {
    //@Select("SELECT * FROM advertising a LEFT JOIN ad_photo p ON a.adid=p.adid WHERE a.adstate=0 AND p.phototype=0")
    //@Select("select * from ad_photo")
    List<Adphoto> findBidPhoto();



}
