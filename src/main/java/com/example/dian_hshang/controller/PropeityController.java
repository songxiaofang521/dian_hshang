package com.example.dian_hshang.controller;


import com.example.dian_hshang.model.po.Propeity;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.PropeityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("api/propeity")
public class PropeityController {

    @Resource
     public PropeityService propeityService;

    @GetMapping("queryAttrDateBy")
    public Map queryAttrDateBy(Integer typeId){
        Map map=propeityService.queryAttrDateBy(typeId);
        return map;
    }


    @PostMapping("queryTypeId")
    public Map queryTypeId(Integer typeId){
        Map map=propeityService.queryTypeId(typeId);
        return map;
    }



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

   /* 请求方式 post
   * 路径 http://192.168.1.11:8082/api/propeity/updatepropeity
   * 必传 id
   * 属性的修改
   * */
   @PostMapping("updatepropeity")
   public Map updatepropeity(Propeity propeity){
       Map map = propeityService.updatepropeity(propeity);
       return map;
   }

   /*请求方式 post
   * 路径 http://192.168.1.11:8082/api/propeity/deletepropeity
   * 必传属性 id
   * */

   @PostMapping("deletepropeity")
   public Map deletepropeity(Integer id){
       Map map = propeityService.deletepropeity(id);
       return map;
   }

}
