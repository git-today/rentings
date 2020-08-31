package com.aaa.entity;

import com.sun.javafx.beans.IDProperty;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "house_photo")
public class House_photo_Y {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "hpid")
    private Integer hpid;
    @Column(name = "hphoto")
    private String hphoto;
    @Column(name = "hid")
    private Integer hid;

    public House_photo_Y() {
        super();
    }

    @Override
    public String toString() {
        return "House_photo_Y{" +
                "hpid=" + hpid +
                ", hphoto='" + hphoto + '\'' +
                ", hid=" + hid +
                '}';
    }

    public String getHphoto() {
        return hphoto;
    }

    public void setHphoto(String hphoto) {
        this.hphoto = hphoto;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getHpid() {
        return hpid;
    }

    public void setHpid(Integer hpid) {
        this.hpid = hpid;
    }

    public House_photo_Y(Integer hpid, String hphoto, Integer hid) {
        this.hpid = hpid;
        this.hphoto = hphoto;
        this.hid = hid;
    }
}
