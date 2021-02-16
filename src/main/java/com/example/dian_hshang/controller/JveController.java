package com.example.dian_hshang.controller;


import com.example.dian_hshang.service.JveService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("api/jve")
public class JveController {

    @Resource
    public JveService jveService;

    @GetMapping("queryJve")
    public Map queryJve(){
        Map map=jveService.queryJve();
        return map;
    }
}
