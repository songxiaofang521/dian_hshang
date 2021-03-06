package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.JveDao;
import com.example.dian_hshang.model.po.Jve;
import com.example.dian_hshang.service.JveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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

    @Override
    public Map addJve(Jve jve) {
        Map map=new HashMap();
        jve.setCreateDate(new Date());
        jve.setIsDel(0);
        jveDao.addJve(jve);
        map.put("code",200);
        map.put("message","成功");
        return map;
    }

    @Override
    public Map updateJve(Jve jve) {
        Map map=new HashMap();
        jveDao.updateJve(jve);
        map.put("code",200);
        map.put("message","成功");
        return map;
    }

    @Override
    public Map deleteJve(Jve jve) {
        Map map=new HashMap();
        Jve jve1=jveDao.queryById(jve.getId());
        jve1.setIsDel(1);
        jveDao.deleteJve(jve1);
        map.put("code",200);
        map.put("message","成功");
        return map;
    }
}
