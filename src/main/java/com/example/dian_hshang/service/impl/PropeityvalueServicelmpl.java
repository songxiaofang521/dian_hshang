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
}
