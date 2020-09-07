package com.aaa.dao;

import com.aaa.entity.Menu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface Menudao extends  tk.mybatis.mapper.common.Mapper<Menu>{

    @Select("SELECT * from menu where mid in (SELECT mid from Role_menu WHERE role_id=#{role_id}) and parent_mid=0")
    List<Map<String, Object>> menuone(Integer role_id);

    @Select("select menu.*,(select count(role_id) from role_menu where role_menu.role_id=#{role_id}\n" +
            "And role_menu.mid=menu.mid) from menu \n" +
            "where menu.parent_mid=#{parent_mid}")
    List<Map<String, Object>> menutwo(Integer role_id, Integer parent_mid);

    Integer menu_insert(Menu menu);

    @Select("select * from menu where parent_mid=0")
    List<Map<String,Object>> menu_query();

    @Select("select * from menu where parent_mid=#{mid}")
    List<Map<String,Object>> menu_twoQueryAll(Integer mid);

    Integer menu_update(Menu menu);

    @Delete("delete from menu where mid=#{mid}")
    Integer menu_delete(Integer mid);
}
