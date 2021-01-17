package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Propeityvalue;

import java.util.Map;

public interface PropeityvalueService {
    Map queryPropeityvalue(Integer id);

    Map addPropeityvalue(Propeityvalue propeityvalue);

    Map updatePropeityvalue(Propeityvalue propeityvalue);

    Map deletePropeityvalue(Integer id);
}
