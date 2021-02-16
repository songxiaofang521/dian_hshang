package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.JveDao;
import com.example.dian_hshang.model.po.Jve;
import com.example.dian_hshang.service.JveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JveServicelmpl implements JveService {

    @Resource
     public JveDao jveDao;

    @Override
    public Map queryJve() {
        Map map=new HashMap();
        List<Jve>list=jveDao.queryJve();
        map.put("data",list);
        return map;
    }
}
