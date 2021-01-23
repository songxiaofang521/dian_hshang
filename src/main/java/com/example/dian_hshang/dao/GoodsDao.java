package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.po.Goodsvalue;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.List;

public interface GoodsDao {
    void addGoods(Goods goods);

    void updateGoods(Goods goods);

    Integer queryDate(StudentBy studentBy);

    List<Goods> queryList(StudentBy studentBy);

    Goods queryById(Integer id);

}
