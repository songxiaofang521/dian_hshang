package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Qian;

import java.util.Map;

public interface QianService {
    Map queryqian();

    Map addQian(Qian qian);

    Map updateQian(Qian qian);
}
