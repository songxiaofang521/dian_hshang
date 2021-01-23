package com.example.dian_hshang.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.dian_hshang.dao.GoodsDao;
import com.example.dian_hshang.dao.GoodsvalueDao;
import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.po.Goodsvalue;
import com.example.dian_hshang.service.GoodsvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsvalueServicelmpl implements GoodsvalueService {

    @Resource
    public GoodsvalueDao goodsvalueDao;

    @Resource
    public GoodsDao goodsDao;

    @Override
    public Map addString(Goods goods, String attr, String sku) {
        Map map=new HashMap();
        //返回主键
        goodsDao.addGoods(goods);
        //声明属性数据的对象
        List<Goodsvalue> list= new ArrayList<>();
        //批量新增
        //将attr的json数组字符串 转为json数组对象
        JSONArray objects = JSONObject.parseArray(attr);
        for (int i = 0; i <objects.size() ; i++) {
            //构建属性数据对象
            Goodsvalue goodsvalue=new Goodsvalue();
            //设置对应的商品id
            goodsvalue.setProId(goods.getId());
            goodsvalue.setAttrData(objects.get(i).toString());
            //放入集合
            list.add(goodsvalue);
        }
        //将sku的json数组字符串转为数组对象
        JSONArray objects1 = JSONObject.parseArray(sku);
        for (int i = 0; i <objects1.size() ; i++) {
            //得到具体一个json对象
            JSONObject o = (JSONObject) objects1.get(i);
            //构建属性数据对象
            Goodsvalue goodsvalue=new Goodsvalue();
             //设置对应的商品id
            goodsvalue.setProId(goods.getId());
            goodsvalue.setPrice(o.getInteger("price"));
            goodsvalue.setStorcks(o.getInteger("storcks"));
            o.remove("price");
            o.remove("storcks");
            goodsvalue.setAttrData(objects1.get(i).toString());
            //放入集合
            list.add(goodsvalue);
        }
        //批量新增
        goodsvalueDao.adds(list);
        map.put("code",200);
        map.put("message","成功");
       return map;
    }

    @Override
    public Map queryGoodsPid(Integer pid) {
        Map map=new HashMap();
        List<Goodsvalue>list=goodsvalueDao.queryGoodsPid(pid);
        map.put("list",list);
        return map;
    }
}
