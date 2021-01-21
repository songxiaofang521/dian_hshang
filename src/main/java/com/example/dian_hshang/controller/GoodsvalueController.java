package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.service.GoodsvalueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/goodsvalue")
public class GoodsvalueController {

    @Resource
    public GoodsvalueService goodsvalueService;

    @PostMapping("addString")
     public Map addString(Goods goods,String attr,String sku){
      Map map=goodsvalueService.addString(goods,attr,sku);
         return map;
     }
}
