package com.example.dian_hshang.controller;

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

     //递归  查询所有的数据
    @PostMapping("queryqian")
    public Map queryqian(){
        Map map=qianService.queryqian();
        return map;
    }

}
