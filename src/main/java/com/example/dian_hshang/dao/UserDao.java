package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.Jve;
import com.example.dian_hshang.model.po.User;
import com.example.dian_hshang.model.vo.StudentBy;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User queryUsername(String name);

    Integer queryshu(StudentBy studentBy);

    List<User> queryList(StudentBy studentBy);

    List<Jve> queryjveshe();

}
