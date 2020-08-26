package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//后台账户表
public class Manager {
    //账号编号
    @Id
    private Integer mgid;
   //账号名
    @Column
    private String mgname;
   // 密码
   @Column
    private String mgpwd;
   //账号状态
   @Column
    private int mgstate;

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

    public int getMgstate() {
        return mgstate;
    }

    public void setMgstate(int mgstate) {
        this.mgstate = mgstate;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgid=" + mgid +
                ", mgname='" + mgname + '\'' +
                ", mgpwd='" + mgpwd + '\'' +
                ", mgstate=" + mgstate +
                '}';
    }
}
