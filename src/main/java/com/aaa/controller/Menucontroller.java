package com.aaa.controller;

import com.aaa.dao.Menudao;
import com.aaa.entity.Menu;
import com.aaa.entity.Role_menu;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("menu")
public class Menucontroller {
    @Resource
    Menudao menudao;

    @RequestMapping("menuone")
    public List<Map<String,Object>> menu_one( Integer role_id){
//        System.out.println("111"+role_menu);
        //System.out.println(permissionDao.menu_one(rol_id));
        //获取一级菜单
        List<Map<String,Object>> listOne=menudao.menuone(role_id);
        System.out.println("222"+listOne);
        //获取二级菜单
        for(Map<String,Object> m:listOne){
            //当前一级菜单下的二级菜单
            System.out.println(role_id);
            System.out.println((Integer) m.get("mid"));
            List<Map<String,Object>> listTwo=menudao.menutwo(role_id, (Integer) m.get("mid"));
            System.out.println(listTwo);
            m.put("listTwo",listTwo);
        }
        return listOne;
    }

    @RequestMapping("menu_insert")
    public Integer menu_insert(Menu menu){
        return menudao.menu_insert(menu);
    }

    @RequestMapping("menu_query")
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
    @RequestMapping("menu_update")
    public Integer menu_update(Menu menu){
        return menudao.menu_update(menu);
    }
    @RequestMapping("menu_delete")
    public Integer menu_delete(Integer mid){
        System.out.println(mid);
        return menudao.menu_delete(mid);
    }

}
