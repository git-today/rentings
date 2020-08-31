package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table(name = "house")
public class House_Y {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
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
    //关联配套房源
    private House_mating house_mating;
    //关联房屋图片
    private List<House_photo_Y> list;
    //关联用户
    private Account_Y account_y;

    public House_Y() {
        super();
    }

    @Override
    public String toString() {
        return "House_Y{" +
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
                ", house_mating=" + house_mating +
                ", list=" + list +
                ", account_y=" + account_y +
                '}';
    }

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

    public House_mating getHouse_mating() {
        return house_mating;
    }

    public void setHouse_mating(House_mating house_mating) {
        this.house_mating = house_mating;
    }

    public List<House_photo_Y> getList() {
        return list;
    }

    public void setList(List<House_photo_Y> list) {
        this.list = list;
    }

    public Account_Y getAccount_y() {
        return account_y;
    }

    public void setAccount_y(Account_Y account_y) {
        this.account_y = account_y;
    }

    public House_Y(Integer hid, String harea, String hcommunity, String htshi, String hting, String htwei, String hmode, Double hprice, String hspace, String hpaymethod, String hlabel, String htime, String hpid, String hadress, String udescribe, Integer htid, Integer hstate, Integer aid, House_mating house_mating, List<House_photo_Y> list, Account_Y account_y) {
        this.hid = hid;
        this.harea = harea;
        this.hcommunity = hcommunity;
        this.htshi = htshi;
        this.hting = hting;
        this.htwei = htwei;
        this.hmode = hmode;
        this.hprice = hprice;
        this.hspace = hspace;
        this.hpaymethod = hpaymethod;
        this.hlabel = hlabel;
        this.htime = htime;
        this.hpid = hpid;
        this.hadress = hadress;
        this.udescribe = udescribe;
        this.htid = htid;
        this.hstate = hstate;
        this.aid = aid;
        this.house_mating = house_mating;
        this.list = list;
        this.account_y = account_y;
    }
}
