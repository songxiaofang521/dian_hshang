package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Qian;
import com.example.dian_hshang.service.QianService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/qian")
public class QianController {

     @Resource
     public QianService qianService;
     /*    路径：         http://192.168.244.1:8082/api/qian/queryqian
     *   请求方式：post
     *
     * */
     //递归  查询所有的数据
    @PostMapping("queryqian")
    public Map queryqian(){
        Map map=qianService.queryqian();
        return map;
    }

    /*权限表新增
    * 请求方式： post
    * 路径：http://192.168.244.1:8082/api/qian/addQian
    * */
    @PostMapping("addQian")
    public Map addQian(Qian qian){
        Map map=qianService.addQian(qian);
        return map;
    }

    /* 修改
    *   请求方式 post
    *   路径：http://192.168.244.1:8082/api/qian/updateQian
    * */

    @PostMapping("updateQian")
    public Map updateQian(Qian qian){
        Map map=qianService.updateQian(qian);
        return map;
    }

}
