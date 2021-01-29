package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.UserDao;
import com.example.dian_hshang.model.po.User;
import com.example.dian_hshang.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServicelmpl implements UserService {

    @Resource
    public UserDao userDao;

    @Override
    public Map addUser(User user) {
        Map map=new HashMap();
        if (user!=null){
            map.put("code",400);
            map.put("message","对象为空");
        }
        user.setUpdateDate(new Date());
        user.setCreateDate(new Date());
        userDao.addUser(user);
        map.put("code",200);
        map.put("message","注册成功");
        return map;
    }
}
