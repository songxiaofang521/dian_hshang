package com.example.dian_hshang.controller;


import com.example.dian_hshang.model.po.Jve;
import com.example.dian_hshang.service.JveService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("addJve")
    public Map addJve(Jve jve){
        Map map=jveService.addJve(jve);
        return map;
    }

    @PostMapping("updateJve")
    public Map updateJve(Jve jve){
        Map map=jveService.updateJve(jve);
        return map;
    }
}
