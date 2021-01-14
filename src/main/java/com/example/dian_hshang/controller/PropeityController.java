package com.example.dian_hshang.controller;


import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.PropeityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/propeity")
public class PropeityController {

    @Resource
     public PropeityService propeityService;

    @PostMapping("list")
    public Map getPropeity(StudentBy studentBy){
        Map map=new HashMap();
        if (studentBy.getCurrpage()==null){
            map.put("coed",400);
            map.put("message","页数为零");
            return map;
        }
        if (studentBy.getPageSize()==null){
            map.put("code",401);
            map.put("message","条数为零");
            return map;
        }
        Map rs=propeityService.getPropeity(studentBy);
        map.put("code",200);
        map.put("message","成功");
        map.put("data",rs);
        return map;
    }




}
