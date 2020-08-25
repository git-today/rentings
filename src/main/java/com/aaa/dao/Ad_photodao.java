package com.aaa.dao;

import com.aaa.entity.Ad_photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Ad_photodao  extends tk.mybatis.mapper.common.Mapper<Ad_photodao> {

    List<Ad_photo> findBigPhoto();
}
