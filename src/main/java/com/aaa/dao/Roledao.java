package com.aaa.dao;

import com.aaa.entity.Role;
import com.aaa.entity.Role_menu;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface Roledao extends tk.mybatis.mapper.common.Mapper<Role> {
    //添加管理员的模块
    @Insert("insert into role_menu (role_id,mid) values(#{role_id},#{mid})")
    Integer setAuthority(@Param("role_id") Integer role_id, @Param("mid") Integer mid);

    @Select("select * from role_menu where role_id=#{role_id} and mid=#{mid}")
    List<Role_menu> queryrole_menu(@Param("role_id") Integer role_id, @Param("mid") Integer mid);

    //删除管理员的功能模块
    @Delete("delete from role_menu where role_id=#{role_id}")
    Integer deleterole_menu(Integer role_id);

    //查询管理员模块对应的二级菜单
    @Select("select pr.mid,p.mname\n" +
            "from role_menu pr\n" +
            "join menu p\n" +
            "on pr.mid=p.mid\n" +
            "where pr.role_id=#{role_id} and p.parent_mid!=0")
    List<Map<String,Object>> queryRole_id(Integer role_id);
}
