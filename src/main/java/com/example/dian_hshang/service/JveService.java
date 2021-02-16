package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Jve;

import java.util.Map;

public interface JveService {
    Map queryJve();

    Map addJve(Jve jve);

    Map updateJve(Jve jve);
}
