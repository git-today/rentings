package com.aaa.controller;

import com.aaa.dao.Managerdao;
import com.aaa.entity.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("manager")
public class ManagerController {

    @Resource
    private Managerdao service;

    //登录
    @RequestMapping(value="rember",method=RequestMethod.POST)
    public List<Manager> rember(@RequestBody Map<Object,Object> map, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //创建一个Cookie[]
        Cookie[] cookie=req.getCookies();

        //获取账号和密码的值
        String user_tel= (String) map.get("mgname");
        String user_password= (String) map.get("mgpwd");
        //查询出账号和密码的数据
        List<Manager> list= service.queryNamePwd(user_tel, user_password);

        //如果集合不为空，则账号和密码都正确
        if (list.size()>0){
            //把账号和密码转换为Cookie对象
            Cookie cookiename=new Cookie("user_tel", URLEncoder.encode(user_tel,"UTF-8"));
            Cookie cookiepwd=new Cookie("user_password",URLEncoder.encode(user_password,"UTF-8"));

            //设置时间周期为两个小时
            cookiename.setMaxAge(60*60*2);
            cookiepwd.setMaxAge(60*60*2);

            //把Cookie对象存入resp中
            resp.addCookie(cookiename);
            resp.addCookie(cookiepwd);
            //创建一个session对象
            HttpSession session=req.getSession();
            //用session对象传入list集合
            session.setAttribute("list", list);
            //把list转发到登录成功页面
            req.setAttribute("users", list);
            System.out.println("成功："+list);
            req.getRequestDispatcher("/jsp/font/front.jsp").forward(req, resp);
            return list;
        }else{
            //密码和账号错误，转入错误页面
            req.setAttribute("msg", "管理员名或密码错误，请重新登录");
            System.out.println("失败");
            return null;
        }
    }

    @RequestMapping("close")
    public void close(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookie=req.getCookies();

        if (cookie!=null){

            for(int i=0;i<cookie.length;i++){
                cookie[i].setMaxAge(0);
            }
        }

        HttpSession session=req.getSession();

        //销毁session

        session.invalidate();
        resp.sendRedirect("../index.jsp");

    }
}
