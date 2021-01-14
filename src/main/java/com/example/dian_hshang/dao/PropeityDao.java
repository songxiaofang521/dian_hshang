package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Propeity;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.List;

public interface PropeityDao {
    Integer queryDate(StudentBy studentBy);

    List<Propeity> queryListBy(StudentBy studentBy);
}
