package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//角色表
public class Role {
//角色编号
    @Id
    @Column
    private Integer role_id;
   //角色名
    @Column
    private String  role_name;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
