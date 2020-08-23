package com.aaa.entity;

public class Menu {

    private  Integer  mid;
    private  String    mname;
    private  String    url;
    private  Integer  parent_mid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParent_mid() {
        return parent_mid;
    }

    public void setParent_mid(Integer parent_mid) {
        this.parent_mid = parent_mid;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", url='" + url + '\'' +
                ", parent_mid=" + parent_mid +
                '}';
    }
}
