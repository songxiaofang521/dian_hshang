package com.example.dian_hshang.service.impl;


import com.example.dian_hshang.dao.QianDao;
import com.example.dian_hshang.model.po.Qian;
import com.example.dian_hshang.service.QianService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QianServicelmpl implements QianService {

    @Resource
    public QianDao qianDao;

  /*查询所有数据*/
    @Override
    public Map queryqian() {
        Map map=new HashMap();
        List<Qian>list=qianDao.queryqian();
        map.put("list",list);
        return map;
    }

    @Override
    public Map addQian(Qian qian) {
        Map map=new HashMap();
        qian.setCreateDate(new Date());
        qian.setPid(qian.getId());
        qianDao.addQian(qian);
        map.put("code",200);
        map.put("message","成功");
        return map;
    }
}
