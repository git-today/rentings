package com.aaa.entity;
//模糊搜索条件实体类
public class SearchInfo {
    //区/县
    private String hadress;
    //街道
    private String harea;
    //小区
    private String hcommunity;
    //租金低
    private Double hprice1;
    //租金高
    private Double hprice2;
    //租赁方式 整租/合租
    private Integer hmode;
    //户型 几室
    private String htshi;
    //朝向
    private String htdirect;
    //楼层
    private String hfloor;
    //装修
    private String htype;

    //分页
    private Integer pageNum;
    private Integer pageSize;

    /*按租金排序 DESC ASC*/
    private String hpriceOrder;
    /*按面积排序 DESC ASC*/
    private String hspaceOrder;

    /*模糊搜索*/
    private String searchs;

    public SearchInfo() {
        super();
    }

    public String getHadress() {
        return hadress;
    }

    @Override
    public String toString() {
        return "SearchInfo{" +
                "hadress='" + hadress + '\'' +
                ", harea='" + harea + '\'' +
                ", hcommunity='" + hcommunity + '\'' +
                ", hprice1=" + hprice1 +
                ", hprice2=" + hprice2 +
                ", hmode=" + hmode +
                ", htshi='" + htshi + '\'' +
                ", htdirect='" + htdirect + '\'' +
                ", hfloor='" + hfloor + '\'' +
                ", htype='" + htype + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", hpriceOrder='" + hpriceOrder + '\'' +
                ", hspaceOrder='" + hspaceOrder + '\'' +
                ", searchs='" + searchs + '\'' +
                '}';
    }

    public void setHadress(String hadress) {
        this.hadress = hadress;
    }

    public String getHarea() {
        return harea;
    }

    public void setHarea(String harea) {
        this.harea = harea;
    }

    public String getHcommunity() {
        return hcommunity;
    }

    public void setHcommunity(String hcommunity) {
        this.hcommunity = hcommunity;
    }

    public Double getHprice1() {
        return hprice1;
    }

    public void setHprice1(Double hprice1) {
        this.hprice1 = hprice1;
    }

    public Double getHprice2() {
        return hprice2;
    }

    public void setHprice2(Double hprice2) {
        this.hprice2 = hprice2;
    }

    public Integer getHmode() {
        return hmode;
    }

    public void setHmode(Integer hmode) {
        this.hmode = hmode;
    }

    public String getHtshi() {
        return htshi;
    }

    public void setHtshi(String htshi) {
        this.htshi = htshi;
    }

    public String getHtdirect() {
        return htdirect;
    }

    public void setHtdirect(String htdirect) {
        this.htdirect = htdirect;
    }

    public String getHfloor() {
        return hfloor;
    }

    public void setHfloor(String hfloor) {
        this.hfloor = hfloor;
    }

    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getHpriceOrder() {
        return hpriceOrder;
    }

    public void setHpriceOrder(String hpriceOrder) {
        this.hpriceOrder = hpriceOrder;
    }

    public String getHspaceOrder() {
        return hspaceOrder;
    }

    public void setHspaceOrder(String hspaceOrder) {
        this.hspaceOrder = hspaceOrder;
    }

    public String getSearchs() {
        return searchs;
    }

    public void setSearchs(String searchs) {
        this.searchs = searchs;
    }

    public SearchInfo(String hadress, String harea, String hcommunity, Double hprice1, Double hprice2, Integer hmode, String htshi, String htdirect, String hfloor, String htype, Integer pageNum, Integer pageSize, String hpriceOrder, String hspaceOrder, String searchs) {
        this.hadress = hadress;
        this.harea = harea;
        this.hcommunity = hcommunity;
        this.hprice1 = hprice1;
        this.hprice2 = hprice2;
        this.hmode = hmode;
        this.htshi = htshi;
        this.htdirect = htdirect;
        this.hfloor = hfloor;
        this.htype = htype;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.hpriceOrder = hpriceOrder;
        this.hspaceOrder = hspaceOrder;
        this.searchs = searchs;
    }
}
