package com.aaa.dao;

import com.aaa.entity.Manager;

import java.util.List;

public interface Managerdao {
    List<Manager> query(String mgname, String mgpwd);
    List<Manager> querySearch(String mgname);
    List<Manager> querylikeSearch(String mgname);
    int queryBynameandpwd(String mgname, String mgpwd);

    int queryByname(String mgname);
    int doadd(Manager manager);
    int doupd(Manager manager);
    List<Manager>query();
    List<Manager>queryid(Integer mgid);

    int count();
}
