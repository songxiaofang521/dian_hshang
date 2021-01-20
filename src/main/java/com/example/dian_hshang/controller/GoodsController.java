package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.service.GoodsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/goods")
public class GoodsController {

    @Resource
    public GoodsService goodsService;

    /* 请求方式
    *
    * */

    @PostMapping("addGoods")
    public Map addGoods(Goods goods){
        Map map=goodsService.addGoods(goods);
        return map;
    }


    @PostMapping("updateGoods")
     public Map updateGoods(Goods goods){
        Map map=goodsService.updateGoods(goods);
        return map;
     }



}
