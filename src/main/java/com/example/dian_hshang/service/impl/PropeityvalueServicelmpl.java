package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.PropeityvalueDao;
import com.example.dian_hshang.model.po.Propeityvalue;
import com.example.dian_hshang.service.PropeityvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PropeityvalueServicelmpl implements PropeityvalueService {

    @Resource
    public PropeityvalueDao propeityvalueDao;


    @Override
    public Map queryPropeityvalue(Integer id) {
        Map map=new HashMap();
        List<Propeityvalue> list = propeityvalueDao.queryPropeityvalue(id);
        map.put("list",list);
        return map;
    }

    @Override
    public Map addPropeityvalue(Propeityvalue propeityvalue) {
        Map map=new HashMap();
        propeityvalueDao.addPropeityvalue(propeityvalue);
        map.put("code",200);
        map.put("message","新增成功");
        return map;
    }

    @Override
    public Map updatePropeityvalue(Propeityvalue propeityvalue) {
        Map map=new HashMap();
        propeityvalueDao.updatePropeityvalue(propeityvalue);
        map.put("code",200);
        map.put("message","修改成功");
        return map;
    }
}
