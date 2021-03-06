package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.GoodsDao;
import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jnlp.IntegrationService;
import java.util.*;

@Service
public class GoodsServicelmpl implements GoodsService {

    @Resource
    public GoodsDao goodsDao;

    @Override
    public Map addGoods(Goods goods) {
        Map map=new HashMap();
        if (goods==null){
            map.put("code",400);
            map.put("message","传值为空");
        }
        goods.setUpdateDate(new Date());
        goods.setCreateDate(new Date());
        goodsDao.addGoods(goods);
        map.put("code",200);
        map.put("message","新增成功");
        return map;
    }

    @Override
    public Map updateGoods(Goods goods) {
        Map map=new HashMap();
        if (goods==null){
            map.put("code",400);
            map.put("message","传值为空");
        }
        goods.setUpdateDate(new Date());
        goodsDao.updateGoods(goods);
        map.put("code",200);
        map.put("message","修改成功");
        return map;
    }

    @Override
    public Map queryGood(StudentBy studentBy) {
        Map rs=new HashMap();
         Integer count = goodsDao.queryDate(studentBy);
         rs.put("count",count);
        List <Goods> list= goodsDao.queryList(studentBy);
        rs.put("list",list);
        return rs;
    }

    @Override
    public Map delete(Integer id) {
        Map map=new HashMap();
        Goods goods= goodsDao.queryById(id);
        if(goods!=null){
            goods.setUpdateDate(new Date());
            goods.setIsDel(1);
            map.put("code",200);
            map.put("message","删除成功");
        }
        map.put("code",400);
        map.put("message","删除失败");
        return map;
    }

    @Override
    public Map huixian(Integer id) {
        Map map=new HashMap();
        Goods goods= goodsDao.queryById(id);
        map.put("code",200);
        map.put("message","回显成功");
        map.put("data",goods);
        return map;
    }




}
