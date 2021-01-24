package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.Propeity;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.Map;

public interface PropeityService {
    Map getPropeity(StudentBy studentBy);

    Map addpropeity(Propeity propeity);

    Map updatepropeity(Propeity propeity);

    Map deletepropeity(Integer id);

    Map queryTypeId(Integer typeId);

    Map queryAttrDateBy(Integer typeId);
}
