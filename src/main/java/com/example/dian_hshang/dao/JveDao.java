package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Jve;

import java.util.List;

public interface JveDao {
    List<Jve> queryJve();

    void addJve(Jve jve);

    void updateJve(Jve jve);

    Jve queryById(Integer id);

    void deleteJve(Jve jve1);
}
