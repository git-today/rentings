package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Blacklist {
    @Id
    @Column
    private Integer bid;
    @Column
    private String recsuse;
    @Column
    private Integer reid;

    public Blacklist() {
    }

    public Blacklist(Integer bid, String recsuse, Integer reid) {
        this.bid = bid;
        this.recsuse = recsuse;
        this.reid = reid;
    }

    @Override
    public String toString() {
        return "Blacklist{" +
                "bid=" + bid +
                ", recsuse='" + recsuse + '\'' +
                ", reid=" + reid +
                '}';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getRecsuse() {
        return recsuse;
    }

    public void setRecsuse(String recsuse) {
        this.recsuse = recsuse;
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }
}
