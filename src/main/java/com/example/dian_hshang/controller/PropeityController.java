package com.example.dian_hshang.controller;


import com.example.dian_hshang.model.po.Propeity;
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

    /*请求方式 post
    * 路径 http://192.168.1.11:8082/api/propeity/list?pageSize=3
    * 必传参数 pageSize 条数 currpage 页数
    * */

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

   /* 属性新增
   *请求方式 post
   * 路径 http://192.168.1.11:8082/api/propeity/addpropeity
   *
   * */

   @PostMapping("addpropeity")
   public Map addpropeity(Propeity propeity){
       Map map = propeityService.addpropeity(propeity);
       return map;
   }

}
