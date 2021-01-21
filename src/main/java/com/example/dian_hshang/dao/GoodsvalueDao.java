package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.po.Goodsvalue;

import java.util.List;

public interface GoodsvalueDao {
    void add(Goods goods);

    void adds(List<Goodsvalue> list);
}
