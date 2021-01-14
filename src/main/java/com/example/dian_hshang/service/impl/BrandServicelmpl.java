package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.BrandDao;
import com.example.dian_hshang.model.po.Brand;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrandServicelmpl implements BrandService {

    @Resource
    public BrandDao brandDao;

    @Override
    public Map list(StudentBy studentBy) {
        Map rs=new HashMap();
        Integer count= brandDao.queryDate(studentBy);
        rs.put("count",count);
        List<Brand>list=brandDao.queryList(studentBy);
        rs.put("list",list);
        return rs;
    }

    @Override
    public Map addBrand(Brand brand) {
        Map map=new HashMap();
        brand.setCreateDate(new Date());
        brand.setUpdateDate(new Date());
        brandDao.addBrand(brand);
        map.put("code",200);
        map.put("message","新增成功");
        return map;
    }

    @Override
    public Map updateBrand(Brand brand) {
        Map map=new HashMap();
        brand.setCreateDate(new Date());
        brandDao.updateBrand(brand);
        map.put("code",200);
        map.put("message","修改成功");
        return map;
    }

    @Override
    public Map deleteBrand(Integer id) {
        Map map=new HashMap();
       Brand brand = brandDao.getid(id);
       if (brand!=null){
           brand.setUpdateDate(new Date());
           brand.setIsdel(1);
           brandDao.updateBrand(brand);
           map.put("code",200);
           map.put("message","修改成功");
       }else{
           map.put("code",400);
           map.put("message","为空");
       }
        return map;
    }

    @Override
    public Map queryById(Integer id) {
        Map map=new HashMap();
        Brand brand = brandDao.getid(id);
        map.put("code",200);
        map.put("message","成功");
        map.put("data",brand);
        return map;
    }
}
