package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.User;
import com.example.dian_hshang.model.po.Yj;
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

    /*
    * 查询所有角色信息
    * */

    @PostMapping("jveshe")
    public Map queryjveshe(){
        Map map=userService.queryjveshe();
        return map;
    }

    @GetMapping("queryYj")
    public Map queryYj(Integer uid,String rids){
        Map map=userService.queryYj(uid,rids);
        return map;
    }

}
