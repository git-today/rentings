package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ad_photo")
public class Adphoto_Y {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "adid")
    private Integer adid;
    @Column(name = "phototype")
    private Integer phototype;
    @Column(name = "adphoto")
    private String adphoto;

    public Adphoto_Y() {
        super();
    }

    @Override
    public String toString() {
        return "Adphoto_Y{" +
                "adid=" + adid +
                ", phototype=" + phototype +
                ", adphoto='" + adphoto + '\'' +
                '}';
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public Integer getPhototype() {
        return phototype;
    }

    public void setPhototype(Integer phototype) {
        this.phototype = phototype;
    }

    public String getAdphoto() {
        return adphoto;
    }

    public void setAdphoto(String adphoto) {
        this.adphoto = adphoto;
    }

    public Adphoto_Y(Integer adid, Integer phototype, String adphoto) {
        this.adid = adid;
        this.phototype = phototype;
        this.adphoto = adphoto;
    }
}
