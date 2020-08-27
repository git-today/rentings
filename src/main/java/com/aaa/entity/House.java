package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class House {
    @Id
    private Integer hid; //编号
    @Column
    private String harea; //区域
    @Column
    private String hcommunity; //所属小区
    @Column
    private String htshi; //房屋几室
    @Column
    private String hting; //房屋几厅
    @Column
    private String htwei; //房屋几卫
    @Column
    private String hmode; //租赁方式
    @Column
    private Double hprice; //租金
    @Column
    private String hspace; //房屋面积
    @Column
    private String hpaymethod; //付款方式
    @Column
    private String hlabel; //房屋标签
    @Column
    private String htime; //发布时长
    @Column
    private String hpid; //房屋图片
    @Column
    private String hadress; //地址
    @Column
    private String  udescribe; //用户描述
    @Column
    private Integer htid; //房屋配套
    @Column
    private Integer hstate; //房间状态
    @Column
    private Integer aid; //房主信息

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHarea() {
        return harea;
    }

    public void setHarea(String harea) {
        this.harea = harea;
    }

    public String getHcommunity() {
        return hcommunity;
    }

    public void setHcommunity(String hcommunity) {
        this.hcommunity = hcommunity;
    }

    public String getHtshi() {
        return htshi;
    }

    public void setHtshi(String htshi) {
        this.htshi = htshi;
    }

    public String getHting() {
        return hting;
    }

    public void setHting(String hting) {
        this.hting = hting;
    }

    public String getHtwei() {
        return htwei;
    }

    public void setHtwei(String htwei) {
        this.htwei = htwei;
    }

    public String getHmode() {
        return hmode;
    }

    public void setHmode(String hmode) {
        this.hmode = hmode;
    }

    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    public String getHspace() {
        return hspace;
    }

    public void setHspace(String hspace) {
        this.hspace = hspace;
    }

    public String getHpaymethod() {
        return hpaymethod;
    }

    public void setHpaymethod(String hpaymethod) {
        this.hpaymethod = hpaymethod;
    }

    public String getHlabel() {
        return hlabel;
    }

    public void setHlabel(String hlabel) {
        this.hlabel = hlabel;
    }

    public String getHtime() {
        return htime;
    }

    public void setHtime(String htime) {
        this.htime = htime;
    }

    public String getHpid() {
        return hpid;
    }

    public void setHpid(String hpid) {
        this.hpid = hpid;
    }

    public String getHadress() {
        return hadress;
    }

    public void setHadress(String hadress) {
        this.hadress = hadress;
    }

    public String getUdescribe() {
        return udescribe;
    }

    public void setUdescribe(String udescribe) {
        this.udescribe = udescribe;
    }

    public Integer getHtid() {
        return htid;
    }

    public void setHtid(Integer htid) {
        this.htid = htid;
    }

    public Integer getHstate() {
        return hstate;
    }

    public void setHstate(Integer hstate) {
        this.hstate = hstate;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "House{" +
                "hid=" + hid +
                ", harea='" + harea + '\'' +
                ", hcommunity='" + hcommunity + '\'' +
                ", htshi='" + htshi + '\'' +
                ", hting='" + hting + '\'' +
                ", htwei='" + htwei + '\'' +
                ", hmode='" + hmode + '\'' +
                ", hprice=" + hprice +
                ", hspace='" + hspace + '\'' +
                ", hpaymethod='" + hpaymethod + '\'' +
                ", hlabel='" + hlabel + '\'' +
                ", htime='" + htime + '\'' +
                ", hpid='" + hpid + '\'' +
                ", hadress='" + hadress + '\'' +
                ", udescribe='" + udescribe + '\'' +
                ", htid=" + htid +
                ", hstate=" + hstate +
                ", aid=" + aid +
                '}';
    }
}
