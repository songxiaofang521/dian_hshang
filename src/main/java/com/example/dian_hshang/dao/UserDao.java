package com.example.dian_hshang.dao;

import com.example.dian_hshang.model.po.User;

public interface UserDao {
    void addUser(User user);

    User queryUsername(String name);
}
