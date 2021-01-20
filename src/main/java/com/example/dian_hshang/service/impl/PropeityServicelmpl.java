package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.PropeityDao;
import com.example.dian_hshang.model.po.Propeity;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.PropeityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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

    @Override
    public Map addpropeity(Propeity propeity) {
        Map map=new HashMap();
        if (propeity==null){
            map.put("code",400);
            map.put("message","传值为空");
        }
        propeity.setIsDel(0);
        propeity.setCreateDate(new Date());
        propeity.setUpdateDate(new Date());
        propeityDao.addpropeity(propeity);
        map.put("code",200);
        map.put("message","新增成功");
        return map;
    }

    @Override
    public Map updatepropeity(Propeity propeity) {
        Map map=new HashMap();
        if (propeity==null){
            map.put("code",400);
            map.put("message","传值为空");
        }
        propeity.setUpdateDate(new Date());
        propeityDao.updatepropeity(propeity);
        map.put("code",200);
        map.put("message","修改成功");
        return map;
    }

    @Override
    public Map deletepropeity(Integer id) {
        Map map=new HashMap();
        if (id==null){
            map.put("code",400);
            map.put("message","传值为空");
        }
        Propeity propeity = propeityDao.getid(id);
        if (propeity==null){
            map.put("code",401);
            map.put("message","根据id查询一天数据为空");
        }
        propeity.setUpdateDate(new Date());
        propeity.setIsDel(1);
        propeityDao.updatepropeityByIS(propeity);
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }

    @Override
    public Map queryTypeId(Integer typeId) {
        Map map=new HashMap();
        List<Propeity> list = propeityDao.queryTypeId(typeId);
        map.put("code",200);
        map.put("message","成功");
        map.put("data",list);
        return map;
    }
}
