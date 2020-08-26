package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table(name = "ad_photo")
public class Adphoto {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "adid")
    private Integer adid;
    @Column(name = "phototype")
    private Integer phototype;
    @Column(name = "adphoto")
    private String adphoto;
    private List<Advertising> list;

    public Adphoto() {
        super();
    }

    @Override
    public String toString() {
        return "Adphoto{" +
                "adid=" + adid +
                ", phototype=" + phototype +
                ", adphoto='" + adphoto + '\'' +
                ", list=" + list +
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

    public List<Advertising> getList() {
        return list;
    }

    public void setList(List<Advertising> list) {
        this.list = list;
    }

    public Adphoto(Integer adid, Integer phototype, String adphoto, List<Advertising> list) {
        this.adid = adid;
        this.phototype = phototype;
        this.adphoto = adphoto;
        this.list = list;
    }
}
