package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.UserDao;
import com.example.dian_hshang.model.po.Jve;
import com.example.dian_hshang.model.po.User;
import com.example.dian_hshang.model.po.Yj;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

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

    @Override
    public Map queryUser(User user) {
        Map map=new HashMap();
        User user1=userDao.queryUsername(user.getName());
        if (user1!=null){
            if(user1.getPassword().equals(user.getPassword())){
               map.put("code",200);
               map.put("message","成功登录");
            }else{
                map.put("code",402);
                map.put("message","密码不正确");
            }
        }else{
            map.put("code",400);
            map.put("message","用户不存在");
        }
        return map;
    }

    @Override
    public Map queryUs(StudentBy studentBy) {
        Map map=new HashMap();
        Integer count=userDao.queryshu(studentBy);
        map.put("count",count);
        List<User>list=userDao.queryList(studentBy);
        map.put("list",list);
        return map;
    }

    @Override
    public Map queryjveshe() {
        Map map=new HashMap();
        List<Jve>list=userDao.queryjveshe();
        map.put("list",list);
        map.put("code",200);
        map.put("message","成功");
        return map;
    }

    @Override
    public Map queryYj(Integer uid, String rids) {
        Map map=new HashMap();
        List<Yj>list=new ArrayList<>();
       //处理新的角色
        String [] split=rids.split(",");
        for (int i = 0; i < split.length; i++) {
            Yj yj=new Yj();
            yj.setUid(uid);
            yj.setRid(Integer.valueOf(split[i]));
            list.add(yj);
        }
        userDao.addYj(list);
        map.put("code",200);
        map.put("message","新增成功");
        return map;
    }


}
