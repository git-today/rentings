package com.aaa.entity;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "advertising")
public class Advertising {
    @Id
    @KeySql(dialect = IdentityDialect.MYSQL)
    @Column(name = "adid")
    private Integer adid;
    @Column(name = "adname")
    private String adname;
    @Column(name = "adcontent")
    private String adcontent;
    @Column(name = "adprice")
    private Double adprice;
    @Column(name = "addate")
    private String addate;
    @Column(name = "advertiser")
    private String advertiser;
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "adStarttime")
    private String adStarttime;
    @Column(name = "adEndtime")
    private String adEndtime;

    public Advertising() {
        super();
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "adid=" + adid +
                ", adname='" + adname + '\'' +
                ", adcontent='" + adcontent + '\'' +
                ", adprice=" + adprice +
                ", addate='" + addate + '\'' +
                ", advertiser='" + advertiser + '\'' +
                ", pid=" + pid +
                ", adStarttime='" + adStarttime + '\'' +
                ", adEndtime='" + adEndtime + '\'' +
                '}';
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getAdcontent() {
        return adcontent;
    }

    public void setAdcontent(String adcontent) {
        this.adcontent = adcontent;
    }

    public Double getAdprice() {
        return adprice;
    }

    public void setAdprice(Double adprice) {
        this.adprice = adprice;
    }

    public String getAddate() {
        return addate;
    }

    public void setAddate(String addate) {
        this.addate = addate;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getAdStarttime() {
        return adStarttime;
    }

    public void setAdStarttime(String adStarttime) {
        this.adStarttime = adStarttime;
    }

    public String getAdEndtime() {
        return adEndtime;
    }

    public void setAdEndtime(String adEndtime) {
        this.adEndtime = adEndtime;
    }

    public Advertising(Integer adid, String adname, String adcontent, Double adprice, String addate, String advertiser, Integer pid, String adStarttime, String adEndtime) {
        this.adid = adid;
        this.adname = adname;
        this.adcontent = adcontent;
        this.adprice = adprice;
        this.addate = addate;
        this.advertiser = advertiser;
        this.pid = pid;
        this.adStarttime = adStarttime;
        this.adEndtime = adEndtime;
    }
}
