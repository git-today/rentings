package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;

public class Account {
    //用户账号编号
    @Id
    @Column(name="aid") //数据库查询时用到的名字
    private Integer id; //返回数据到vue页面时用的名字
    @Column
    private String aphone;//用户手机号
    @Column
    private String apwd;//用户密码
    @Column
    private Integer apost;//用户账号类型
    @Column
    private Integer astate;//用户账号状态
    @Column
    private Integer usex;//用户性别
    @Column
    private String aname;//身份证姓名
    @Column
    private String anumber;//身份证号
    @Column
    private String aborth;//注册时间
    @Column
    private String adress;//地址
    @Column
    private String adescribe;//用户描述

    public Integer getId() {
        return id;
    }

    public void setAid(Integer id) {
        this.id = id;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public Integer getApost() {
        return apost;
    }

    public void setApost(Integer apost) {
        this.apost = apost;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public Integer getUsex() {
        return usex;
    }

    public void setUsex(Integer usex) {
        this.usex = usex;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAnumber() {
        return anumber;
    }

    public void setAnumber(String anumber) {
        this.anumber = anumber;
    }

    public String getAborth() {
        return aborth;
    }

    public void setAborth(String aborth) {
        this.aborth = aborth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdescribe() {
        return adescribe;
    }

    public void setAdescribe(String adescribe) {
        this.adescribe = adescribe;
    }

    public Account() {
        super();
    }

    public Account(Integer id, String aphone, String apwd, Integer apost, Integer astate, Integer usex, String aname, String anumber, String aborth, String adress, String adescribe) {
        this.id = id;
        this.aphone = aphone;
        this.apwd = apwd;
        this.apost = apost;
        this.astate = astate;
        this.usex = usex;
        this.aname = aname;
        this.anumber = anumber;
        this.aborth = aborth;
        this.adress = adress;
        this.adescribe = adescribe;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + id +
                ", aphone='" + aphone + '\'' +
                ", apwd='" + apwd + '\'' +
                ", apost=" + apost +
                ", astate=" + astate +
                ", usex=" + usex +
                ", aname='" + aname + '\'' +
                ", anumber='" + anumber + '\'' +
                ", aborth='" + aborth + '\'' +
                ", adress='" + adress + '\'' +
                ", adescribe='" + adescribe + '\'' +
                '}';
    }
}
