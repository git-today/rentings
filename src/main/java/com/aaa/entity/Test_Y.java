package com.aaa.entity;

public class Test_Y {
    private Integer id;
    private String name;

    private Integer pageNum;
    private Integer pageSize;

    public Test_Y() {
        super();
    }

    @Override
    public String toString() {
        return "Test_Y{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Test_Y(Integer id, String name, Integer pageNum, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
