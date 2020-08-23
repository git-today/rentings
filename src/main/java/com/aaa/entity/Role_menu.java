package com.aaa.entity;

public class Role_menu {
    private Integer  role_id;
     private Integer mid;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Role_menu{" +
                "role_id=" + role_id +
                ", mid=" + mid +
                '}';
    }
}
