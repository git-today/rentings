package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;

public class House_mating {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "htid")
    private Integer id;
    @Column
    private String htype;
    @Column
    private String htdirect;
    @Column
    private Integer htbed;
    @Column
    private Integer htcar;
    @Column
    private Integer htweb;
    @Column
    private Integer htv;
    @Column
    private Integer htwashing;
    @Column
    private Integer htheating;
    @Column
    private Integer htait;
    @Column
    private Integer htrfrt;
    @Column
    private Integer htheater;
    @Column
    private String hfloor;
    @Column
    private String hfloors;

    public House_mating() {
        super();
    }

    public House_mating(Integer id, String htype, String htdirect, Integer htbed, Integer htcar, Integer htweb, Integer htv, Integer htwashing, Integer htheating, Integer htait, Integer htrfrt, Integer htheater, String hfloor, String hfloors) {
        this.id = id;
        this.htype = htype;
        this.htdirect = htdirect;
        this.htbed = htbed;
        this.htcar = htcar;
        this.htweb = htweb;
        this.htv = htv;
        this.htwashing = htwashing;
        this.htheating = htheating;
        this.htait = htait;
        this.htrfrt = htrfrt;
        this.htheater = htheater;
        this.hfloor = hfloor;
        this.hfloors = hfloors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype;
    }

    public String getHtdirect() {
        return htdirect;
    }

    public void setHtdirect(String htdirect) {
        this.htdirect = htdirect;
    }

    public Integer getHtbed() {
        return htbed;
    }

    public void setHtbed(Integer htbed) {
        this.htbed = htbed;
    }

    public Integer getHtcar() {
        return htcar;
    }

    public void setHtcar(Integer htcar) {
        this.htcar = htcar;
    }

    public Integer getHtweb() {
        return htweb;
    }

    public void setHtweb(Integer htweb) {
        this.htweb = htweb;
    }

    public Integer getHtv() {
        return htv;
    }

    public void setHtv(Integer htv) {
        this.htv = htv;
    }

    public Integer getHtwashing() {
        return htwashing;
    }

    public void setHtwashing(Integer htwashing) {
        this.htwashing = htwashing;
    }

    public Integer getHtheating() {
        return htheating;
    }

    public void setHtheating(Integer htheating) {
        this.htheating = htheating;
    }

    public Integer getHtait() {
        return htait;
    }

    public void setHtait(Integer htait) {
        this.htait = htait;
    }

    public Integer getHtrfrt() {
        return htrfrt;
    }

    public void setHtrfrt(Integer htrfrt) {
        this.htrfrt = htrfrt;
    }

    public Integer getHtheater() {
        return htheater;
    }

    public void setHtheater(Integer htheater) {
        this.htheater = htheater;
    }

    public String getHfloor() {
        return hfloor;
    }

    public void setHfloor(String hfloor) {
        this.hfloor = hfloor;
    }

    public String getHfloors() {
        return hfloors;
    }

    public void setHfloors(String hfloors) {
        this.hfloors = hfloors;
    }

    @Override
    public String toString() {
        return "House_mating{" +
                "id=" + id +
                ", htype='" + htype + '\'' +
                ", htdirect='" + htdirect + '\'' +
                ", htbed=" + htbed +
                ", htcar=" + htcar +
                ", htweb=" + htweb +
                ", htv=" + htv +
                ", htwashing=" + htwashing +
                ", htheating=" + htheating +
                ", htait=" + htait +
                ", htrfrt=" + htrfrt +
                ", htheater=" + htheater +
                ", hfloor='" + hfloor + '\'' +
                ", hfloors='" + hfloors + '\'' +
                '}';
    }
}
