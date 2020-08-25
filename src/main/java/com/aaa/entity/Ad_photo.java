package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table(name = "ad_photo")
public class Ad_photo {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "adid")
    private Integer adid;
    @Column(name = "adphoto")
    private String adphoto;
    List<Advertising> advertisingList;

    public Ad_photo() {
        super();
    }

    @Override
    public String toString() {
        return "Ad_photo{" +
                "adid=" + adid +
                ", adphoto='" + adphoto + '\'' +
                ", advertisingList=" + advertisingList +
                '}';
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getAdphoto() {
        return adphoto;
    }

    public void setAdphoto(String adphoto) {
        this.adphoto = adphoto;
    }

    public List<Advertising> getAdvertisingList() {
        return advertisingList;
    }

    public void setAdvertisingList(List<Advertising> advertisingList) {
        this.advertisingList = advertisingList;
    }

    public Ad_photo(Integer adid, String adphoto, List<Advertising> advertisingList) {
        this.adid = adid;
        this.adphoto = adphoto;
        this.advertisingList = advertisingList;
    }
}
