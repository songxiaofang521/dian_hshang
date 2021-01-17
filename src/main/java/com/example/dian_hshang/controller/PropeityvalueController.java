package com.example.dian_hshang.controller;

import com.example.dian_hshang.service.PropeityvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/propeityvalue")
public class PropeityvalueController {

    @Resource
    public PropeityvalueService propeityvalueService;

    @PostMapping("list")
    public Map queryPropeityvalue(Integer id){
        Map map= propeityvalueService.queryPropeityvalue(id);
       return map;
    }

}
