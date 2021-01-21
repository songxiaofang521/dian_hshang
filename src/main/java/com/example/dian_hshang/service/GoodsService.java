package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.Map;

public interface GoodsService {
    Map addGoods(Goods goods);

    Map updateGoods(Goods goods);

    Map queryGood(StudentBy studentBy);

    Map delete(Integer id);

    Map huixian(Integer id);
}
