package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class House_trouble {
    @Id
    @Column(name = "trid")
    private Integer id;
    @Column
    private String trname;
    @Column
    private String trsolve;

    public House_trouble() {
    }

    public House_trouble(Integer id, String trname, String trsolve) {
        this.id = id;
        this.trname = trname;
        this.trsolve = trsolve;
    }

    @Override
    public String toString() {
        return "House_trouble{" +
                "id=" + id +
                ", trname='" + trname + '\'' +
                ", trsolve='" + trsolve + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrname() {
        return trname;
    }

    public void setTrname(String trname) {
        this.trname = trname;
    }

    public String getTrsolve() {
        return trsolve;
    }

    public void setTrsolve(String trsolve) {
        this.trsolve = trsolve;
    }
}
