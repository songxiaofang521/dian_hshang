package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Brand;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.List;

public interface BrandDao {
    Integer queryDate(StudentBy studentBy);

    List<Brand> queryList(StudentBy studentBy);

    void addBrand(Brand brand);

    void updateBrand(Brand brand);

    Brand getid(Integer id);

    List<Brand> queryBrand();

}
