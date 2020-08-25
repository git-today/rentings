package com.aaa.impl;

import com.aaa.dao.Menudao;
import com.aaa.entity.Menu;
import com.aaa.service.Menuservice;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class Menuimpl implements  Menuservice {
    @Resource
    Menudao menudao;

    @Override
    public int add(Menu menu) {
        return menudao.add(menu);
    }

    @Override
    public int update(Menu menu) {
        return menudao.update(menu);
    }

    @Override
    public int delete(int mid) {
        return menudao.delete(mid);
    }

    @Override
    public List<Menu> query() {
        return menudao.query();
    }

    @Override
    public Map<String, Object> queryId(Integer mid) {
        return menudao.queryId(mid);
    }

    @Override
    public List<Map<String, Object>> queryByRidParentmid(Integer rid, Integer parent_mid) {
        return menudao.queryByRidParentmid(rid,parent_mid);
    }

    @Override
    public List<Map<String, Object>> queryByParentmid(Integer rid, Integer parent_mid) {
            return menudao.queryByParentmid(rid,parent_mid);
    }
}
