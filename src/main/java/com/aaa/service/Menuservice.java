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


    public int add(Menu menu) ;

    public int update(Menu menu) ;

    public int delete(int mid);

    public List<Menu> query() ;

    public Map<String, Object> queryId(Integer mid);

    public List<Map<String, Object>> queryByRidParentmid(Integer rid, Integer parent_mid);

    public List<Map<String, Object>> queryByParentmid(Integer rid, Integer parent_mid) ;

}
