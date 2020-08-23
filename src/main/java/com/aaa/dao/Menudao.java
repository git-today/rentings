package com.aaa.dao;

import com.aaa.entity.Menu;

import java.util.List;
import java.util.Map;

public interface Menudao {

    int add(Menu menu);

    int update(Menu menu);

    int delete(int mid);

    List<Menu> query();

    Map<String, Object> queryId(Integer mid);

    List<Map<String, Object>> queryByRidParentmid(Integer rid, Integer parent_mid);

    List<Map<String, Object>> queryByParentmid(Integer rid, Integer parent_mid);
}
