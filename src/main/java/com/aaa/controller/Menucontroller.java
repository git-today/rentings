package com.aaa.controller;

import com.aaa.dao.Menudao;
import com.aaa.entity.Menu;
import com.aaa.entity.Role_menu;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("menu")
public class Menucontroller {
    @Resource
    Menudao menudao;

    //查询权限菜单，用于权限登录显示管理员模块
    @RequestMapping(value = "menuone",method = RequestMethod.POST)
    public List<Map<String,Object>> menu_one(@RequestBody Map<Object,Object> map){
        int role_id = (int) map.get("role_id");
        //获取一级菜单
        List<Map<String,Object>> listOne=menudao.menuone(role_id);
        //获取二级菜单
        for(Map<String,Object> m:listOne){
            //当前一级菜单下的二级菜单
            List<Map<String,Object>> listTwo=menudao.menutwo(role_id, (Integer) m.get("mid"));
            m.put("listTwo",listTwo);
        }
        return listOne;
    }

    @RequestMapping(value = "menu_insert",method = RequestMethod.POST)
    public Integer menu_insert(@RequestBody Menu menu){
        return menudao.menu_insert(menu);
    }

    //查询权限菜单，用于修改权限
    @RequestMapping(value = "menu_query",method = RequestMethod.POST)
    public List<Map<String,Object>> menu_query(){
        List<Map<String,Object>> listOne=menudao.menu_query();
        //获取二级菜单
        for(Map<String,Object> m:listOne){
            //当前一级菜单下的二级菜单
            List<Map<String,Object>> listTwo=menudao.menu_twoQueryAll((Integer) m.get("mid"));

            System.out.println(listTwo.toString());
            m.put("listTwo",listTwo);
            m.put("twoLength",listTwo.size());
        }
        return listOne;
    }
    @RequestMapping(value = "menu_update",method = RequestMethod.POST)
    public Integer menu_update(@RequestBody Menu menu){
        return menudao.menu_update(menu);
    }
    @RequestMapping(value = "menu_delete",method = RequestMethod.POST)
    public Integer menu_delete(@RequestBody Integer mid){
        System.out.println(mid);
        return menudao.menu_delete(mid);
    }

}
