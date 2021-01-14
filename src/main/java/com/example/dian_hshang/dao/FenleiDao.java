package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Fenlei;

import java.util.List;

public interface FenleiDao {
    List<Fenlei> getData(Fenlei fenlei);

    List<Fenlei> getPid(Integer pid);

    int add(Fenlei fenlei);

    void update(Fenlei fenlei);

    Fenlei getId(Integer id);
}
