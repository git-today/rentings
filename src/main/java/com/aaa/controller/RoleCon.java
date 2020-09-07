package com.aaa.controller;

import com.aaa.dao.Roledao;
import com.aaa.entity.Role_menu;
import com.aaa.entity.Role;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("RoleCon")
public class RoleCon {
    @Resource
    Roledao roleDao;

    //管理员查询，用于显示修改权限
    @RequestMapping(value = "role_query",method = RequestMethod.POST)
    public List<Role> role_query(){
        return roleDao.selectAll();
    }

    //修改管理员名
    @RequestMapping(value = "role_update",method = RequestMethod.POST)
    public Integer rol_update(Role role){
        return roleDao.updateByPrimaryKey(role);
    }

    //删除
    @RequestMapping(value = "role_delete",method = RequestMethod.POST)
    public Integer rol_delete(@RequestBody Role role){
        return roleDao.deleteByPrimaryKey(role);
    }

    //添加
    @RequestMapping(value = "role_insert",method = RequestMethod.POST)
    public Integer rol_insert(Role role){
//        role.setRole_id();
        return roleDao.insert(role);
    }


    //管理员修改权限
    @RequestMapping("setAuthority")
    public Integer setAuthority(Integer role_id,Integer[] mid){
        int count=0;
        if(role_id!=null){
            //删除管理员的功能模块
            roleDao.deleterole_menu(role_id);
            for (Integer p:mid){
                //添加管理员的模块
                roleDao.setAuthority(role_id,p);
                count++;
            }
        }
        return count;
    }

    //查询管理员模块对应的二级菜单
    @RequestMapping("queryRole_id")
    public List<Map<String,Object>> queryRole_id(Integer role_id){
        return roleDao.queryRole_id(role_id);
    }
}
