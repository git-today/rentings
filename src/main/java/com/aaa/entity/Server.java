package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "service")
public class Server {

    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "sid")
    private Integer sid;

    @Column(name="hid")
    private Integer hid;
    @Column
    private Double sprice;
    @Column
    private  String srtime;
    @Column
    private Integer aid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getSrtime() {
        return srtime;
    }

    public void setSrtime(String srtime) {
        this.srtime = srtime;
    }

    @Override
    public String toString() {
        return "Server{" +
                "sid=" + sid +
                ", hid=" + hid +
                ", sprice=" + sprice +
                ", srtime='" + srtime + '\'' +
                ", aid=" + aid +
                '}';
    }

    public Server(){

    }

    public Server(Integer sid, Integer hid, Double sprice, String srtime, Integer aid) {
        this.sid = sid;
        this.hid = hid;
        this.sprice = sprice;
        this.srtime = srtime;
        this.aid = aid;
    }
}
