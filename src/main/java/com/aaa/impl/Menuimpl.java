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
    public List<Map<String, Object>> menuone(Integer role_id) {
        return menudao.menuone(role_id);
    }

    @Override
    public List<Map<String, Object>> menutwo(Integer role_id, Integer parent_mid) {
            return menudao.menutwo(role_id,parent_mid);
    }
}
