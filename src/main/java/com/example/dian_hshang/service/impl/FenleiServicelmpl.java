package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.FenleiDao;
import com.example.dian_hshang.model.po.Fenlei;
import com.example.dian_hshang.service.FenleiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FenleiServicelmpl implements FenleiService {

    @Resource
    public FenleiDao fenleiDao;

    @Override
    public Map getData(Fenlei fenlei) {
        Map map=new HashMap();
        List<Fenlei>list=fenleiDao.getData(fenlei);
        map.put("code",200);
        map.put("message","成功");
        map.put("data",list);
        return map;
    }

    @Override
    public Map getPid(Integer pid) {
        Map map=new HashMap();
        List<Fenlei>list=fenleiDao.getPid(pid);
        map.put("code",200);
        map.put("message","成功");
        map.put("data",list);
        return map;
    }

    @Override
    public Map add(Fenlei fenlei) {
        Map map=new HashMap();
         fenlei.setCreateDate(new Date());
         fenlei.setUpdateDate(new Date());
         fenlei.setIsDel(0);
      int count= fenleiDao.add(fenlei);
        Integer id = fenlei.getId();
        map.put("code",200);
        map.put("message","成功");
        map.put("data",id);
        return map;
    }

    @Override
    public Map update(Fenlei fenlei) {
        Map map=new HashMap();
        fenlei.setUpdateDate(new Date());
        if (fenlei.getIsDel()==null){
            fenlei.setIsDel(0);
        }
        if (fenlei.getPid()==null){
           Fenlei fenlei1= fenleiDao.getId(fenlei.getId());
           fenlei.setPid(fenlei1.getPid());
        }
        fenlei.setPid(fenlei.getPid());
        fenleiDao.update(fenlei);
        map.put("code",200);
        map.put("message","成功");
        return map;
    }

    @Override
    public Map delete(Integer id) {
        Map map=new HashMap();
        Fenlei fenlei1= fenleiDao.getId(id);
        if (fenlei1!=null){
            fenlei1.setIsDel(1);
            fenleiDao.update(fenlei1);
            map.put("code",200);
            map.put("message","成功");
        }else{
            map.put("code",400);
            map.put("message","失败");
        }
        return null;
    }


}
