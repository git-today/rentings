package com.aaa.dao;

import com.aaa.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface Menudao extends  tk.mybatis.mapper.common.Mapper<Menu>{

    int add(Menu menu);

    int update(Menu menu);

    int delete(int mid);

    List<Menu> query();

    Map<String, Object> queryId(Integer mid);

    @Select("SELECT * from menu where mid in (SELECT mid from Role_menu WHERE role_id=?) and parent_mid=?")
    List<Map<String, Object>> queryByRidParentmid(Integer role_id, Integer parent_mid);

    List<Map<String, Object>> queryByParentmid(Integer role_id, Integer parent_mid);
}
