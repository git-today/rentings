package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;

//后台账户表
@Table(name = "manager")
public class Manager  {
    //账号编号
    @Id
    private Integer mgid;
    //账号名
    private String mgname;
    // 密码
    private String mgpwd;
    //角色
    private Integer role_id;
    //账号状态 是否禁用
    private Integer mgstate;

    public Integer getMgstate() {
        return mgstate;
    }

    public void setMgstate(Integer mgstate) {
        this.mgstate = mgstate;
    }

    public Integer getMgid() {
        return mgid;
    }

    public void setMgid(Integer mgid) {
        this.mgid = mgid;
    }

    public String getMgname() {
        return mgname;
    }

    public void setMgname(String mgname) {
        this.mgname = mgname;
    }

    public String getMgpwd() {
        return mgpwd;
    }

    public void setMgpwd(String mgpwd) {
        this.mgpwd = mgpwd;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgid=" + mgid +
                ", mgname='" + mgname + '\'' +
                ", mgpwd='" + mgpwd + '\'' +
                ", role_id=" + role_id +
                ", mgstate=" + mgstate +
                '}';
    }
}
