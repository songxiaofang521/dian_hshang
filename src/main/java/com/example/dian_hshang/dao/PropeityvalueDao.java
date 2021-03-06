package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Propeityvalue;

import java.util.List;

public interface PropeityvalueDao {
    List<Propeityvalue> queryPropeityvalue(Integer id);

    void addPropeityvalue(Propeityvalue propeityvalue);

    void updatePropeityvalue(Propeityvalue propeityvalue);

    void deletePropeityvalue(Integer id);

    Propeityvalue queryById(Integer id);

    List<Propeityvalue> queryDateByTypeId(Integer typeId);
}
