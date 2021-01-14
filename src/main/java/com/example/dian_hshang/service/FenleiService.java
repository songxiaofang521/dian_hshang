package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Fenlei;

import java.util.Map;

public interface FenleiService {
    Map getData(Fenlei fenlei);

    Map getPid(Integer pid);

    Map add(Fenlei fenlei);

    Map update(Fenlei fenlei);

    Map delete(Integer id);
}
