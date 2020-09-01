package com.aaa.service;

import com.aaa.dao.Menudao;
import com.aaa.entity.Menu;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public interface Menuservice {

    public List<Map<String, Object>> menuone(Integer role_id);

    public List<Map<String, Object>> menutwo(Integer role_id, Integer parent_mid) ;



}
