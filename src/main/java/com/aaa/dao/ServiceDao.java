package com.aaa.dao;

import com.aaa.entity.Server;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ServiceDao  extends  tk.mybatis.mapper.common.Mapper<Server>{

    @Select("select ser.sid,ser.hid,h.hcommunity,ser.sprice,ser.aid,acc.aphone,ser.srtime \n" +
            "from service ser left join account acc on ser.aid=acc.aid  \n" +
            "left join house h on ser.hid=h.hid ")
    List<Map<String,Object>>  selectsah();
}
