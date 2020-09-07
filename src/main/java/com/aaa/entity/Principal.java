package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Principal {
    @Id
    @Column
    private String pmanager;
    @Column
    private String prphone;
    @Column
    private Integer mgid;
    @Column
    private Integer role_id;

    public String getPmanager() {
        return pmanager;
    }

    public void setPmanager(String pmanager) {
        this.pmanager = pmanager;
    }

    public String getPrphone() {
        return prphone;
    }

    public void setPrphone(String prphone) {
        this.prphone = prphone;
    }

    public Integer getMgid() {
        return mgid;
    }

    public void setMgid(Integer mgid) {
        this.mgid = mgid;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Principal() {
    }

    public Principal(String pmanager, String prphone, Integer mgid, Integer role_id) {
        this.pmanager = pmanager;
        this.prphone = prphone;
        this.mgid = mgid;
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "pmanager='" + pmanager + '\'' +
                ", prphone='" + prphone + '\'' +
                ", mgid=" + mgid +
                ", role_id=" + role_id +
                '}';
    }
}
