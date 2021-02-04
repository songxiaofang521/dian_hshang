package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Qian;

import java.util.List;

public interface QianDao {
    List<Qian> queryqian();

    void addQian(Qian qian);

    void updateQian(Qian qian);
}
