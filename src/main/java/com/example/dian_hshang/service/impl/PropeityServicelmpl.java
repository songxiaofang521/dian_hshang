package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.PropeityDao;
import com.example.dian_hshang.dao.PropeityvalueDao;
import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.po.Propeity;
import com.example.dian_hshang.model.po.Propeityvalue;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.PropeityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class PropeityServicelmpl implements PropeityService {

    @Resource
    public PropeityDao propeityDao;


    @Resource
    public PropeityvalueDao propeityvalueDao;



    @Override
    public Map queryAttrDateBy(Integer typeId) {
        //声明返回数据
        Map rs=new HashMap();
        //查询出所有的属性数据
        List<Propeity> attrs=propeityDao.queryTypeId(typeId);
        //声明skuDatas
        List<Propeity>skuDats=new ArrayList<>();
        //声明attrDatas
        List<Propeity> attrDatas=new ArrayList<>();
        //遍历所有的属性数据
        for (int i = 0; i <attrs.size() ; i++) {
            //得到具体的一个属性
            Propeity propeity=attrs.get(i);
            //判断此属性是否为sku
            if(propeity.getIsSKU()==0){
               //判断此属性的类型 如果是input 没有values
                if(propeity.getType()!=3){
                    //查询此属性 对应的选项值
                    List<Propeityvalue> propeityvalues = propeityvalueDao.queryPropeityvalue(propeity.getId());
                    propeity.setValues(propeityvalues);
                }
                attrDatas.add(propeity);
            }else{//是sku数据
                //判断此属性的类型 如果是input 没有values
                if(propeity.getType()!=3){
                    //查询此属性 对应的选项值
                    List<Propeityvalue> propeityvalues = propeityvalueDao.queryPropeityvalue(propeity.getId());
                    propeity.setValues(propeityvalues);
                }
                skuDats.add(propeity);
            }
        }
       //查询sku数据
        rs.put("skuDats",skuDats);
        rs.put("attrDatas",attrDatas);
        return rs;
    }











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
