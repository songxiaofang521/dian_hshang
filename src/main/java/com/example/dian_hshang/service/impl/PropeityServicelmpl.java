package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.PropeityDao;
import com.example.dian_hshang.model.po.Propeity;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.PropeityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PropeityServicelmpl implements PropeityService {

    @Resource
    public PropeityDao propeityDao;

    @Override
    public Map getPropeity(StudentBy studentBy) {
        Map map=new HashMap();
        Integer count = propeityDao.queryDate(studentBy);
        map.put("count",count);
        List<Propeity> list= propeityDao.queryListBy(studentBy);
        map.put("list",list);
        return map;
    }
}
