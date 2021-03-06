package com.aaa.dao;

import com.aaa.entity.House;
import com.aaa.entity.House_Y;
import com.aaa.entity.House_photo_Y;
import com.aaa.entity.SearchInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HouseDao_Y extends tk.mybatis.mapper.common.Mapper<House_Y> {
    House_Y fingById(Integer hid);
    House_Y selectById(Integer hid);
    //首页随机
    List<House_Y> findFiveLimit();
    //查询房主名下的其他房源
    List<House_Y> fingOthersHouse(Integer hid);

    int delete(Integer hid);

    int update(House_Y house_y);
    @Select("select * from house order by hid DESC LIMIT 0,1")
    int querymax();
    List<House_Y> findAll(SearchInfo searchInfo);
}
