package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Brand;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.Map;

public interface BrandService {
    Map list(StudentBy studentBy);

    Map addBrand(Brand brand);

    Map updateBrand(Brand brand);

    Map deleteBrand(Integer id);

    Map queryById(Integer id);
}
