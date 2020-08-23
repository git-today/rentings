package com.aaa.entity;

public class Manager_role {
    private  Integer  mgid;
    private  Integer role_id;

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

    @Override
    public String toString() {
        return "Manager_role{" +
                "mgid=" + mgid +
                ", role_id=" + role_id +
                '}';
    }
}
