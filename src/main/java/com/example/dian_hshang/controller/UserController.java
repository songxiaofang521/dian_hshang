package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.User;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("api/user")
public class UserController {

    @Resource
    public UserService userService;

    /*登录*/
    @PostMapping("queryUser")
    public Map queryUser(User user){
        Map map=userService.queryUser(user);
        return map;
    }

    /*注册用户*/
    @PostMapping("addUser")
    public Map addUser(User user){
        Map map=userService.addUser(user);
      return map;
    }

    @GetMapping("queryUs")
    public Map queryUs(StudentBy studentBy){
        Map map=userService.queryUs(studentBy);
        return map;
    }

}
