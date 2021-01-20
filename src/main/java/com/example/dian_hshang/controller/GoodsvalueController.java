package com.example.dian_hshang.controller;

import com.example.dian_hshang.service.GoodsvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("api/goodsvalue")
public class GoodsvalueController {

    @Resource
    public GoodsvalueService goodsvalueService;


}
