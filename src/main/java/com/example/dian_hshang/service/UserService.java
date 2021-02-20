package com.example.dian_hshang.service;

import com.example.dian_hshang.model.po.User;
import com.example.dian_hshang.model.po.Yj;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.Map;

public interface UserService {
    Map addUser(User user);

    Map queryUser(User user);

    Map queryUs(StudentBy studentBy);

    Map queryjveshe();

    Map queryYj(Integer uid, String rids);
}
