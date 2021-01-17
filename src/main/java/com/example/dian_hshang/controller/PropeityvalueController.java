package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Propeityvalue;
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

    @PostMapping("queryById")
    public Map queryById(Integer id){
        Map map=propeityvalueService.queryById(id);
        return map;
    }



    @PostMapping("list")
    public Map queryPropeityvalue(Integer id){
        Map map= propeityvalueService.queryPropeityvalue(id);
       return map;
    }

    @PostMapping("addPropeityvalue")
     public Map addPropeityvalue(Propeityvalue propeityvalue){
        Map map=propeityvalueService.addPropeityvalue(propeityvalue);
        return map;
     }
     @PostMapping("updatePropeityvalue")
     public Map updatePropeityvalue(Propeityvalue propeityvalue){
         Map map=propeityvalueService.updatePropeityvalue(propeityvalue);
         return map;
     }
     @PostMapping("deletePropeityvalue")
     public Map deletePropeityvalue(Integer id){
         Map map=propeityvalueService.deletePropeityvalue(id);
         return map;
     }
}
