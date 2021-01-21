package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Goods;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/goods")
public class GoodsController {

    @Resource
    public GoodsService goodsService;


       @DeleteMapping("delete")
       public Map delete(Integer id){
           Map map=goodsService.delete(id);
           return map;
       }


        /*查询
        *
        *
        * */

        @PostMapping("list")
        public Map queryGood(StudentBy studentBy){
            Map map=new HashMap();
            if (studentBy.getPageSize()==null){
                map.put("code",400);
                map.put("message","不允许");
            }
            if (studentBy.getCurrpage()==null){
                map.put("code",401);
                map.put("message","不允许");
            }
            Map rs=goodsService.queryGood(studentBy);
           return rs;
        }


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
