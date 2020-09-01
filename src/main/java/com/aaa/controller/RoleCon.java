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
    @RequestMapping("role_query")
    public List<Role> rol_query(Role role){
        return roleDao.select(role);
    }

    @RequestMapping("roleall")
    public List<Role> query(){
        return roleDao.selectAll();
    }

    @RequestMapping("role_update")
    public Integer rol_update(Role role){
        return roleDao.updateByPrimaryKey(role);
    }

    @RequestMapping("role_delete")
    public Integer rol_delete(Role role){
        return roleDao.deleteByPrimaryKey(role);
    }

    @RequestMapping("role_insert")
    public Integer rol_insert(Role role){
        return roleDao.insert(role);
    }

    @RequestMapping("setAuthority")
    public Integer setAuthority(Integer role_id,Integer[] mid){
        System.out.println("role_id:"+role_id);
        System.out.println("mid:"+mid);
        int count=0;
        if(role_id!=null){
            roleDao.deleterole_menu(role_id);
            for (Integer p:mid){
                roleDao.setAuthority(role_id,p);
                count++;
            }
        }
        return count;
    }
    @RequestMapping("queryRole_id")
    public List<Map<String,Object>> queryRole_id(Integer role_id){
        return roleDao.queryRole_id(role_id);
    }
}
