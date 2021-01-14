package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Fenlei;
import com.example.dian_hshang.service.FenleiService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("api/type/")
public class FenleiController {

    @Resource
    public FenleiService fenleiService;

    @GetMapping("getData")
    public Map getData(Fenlei fenlei){
      Map rs=fenleiService.getData(fenlei);
      return rs;
    }

    @GetMapping("getPid")
    public Map getPid(Integer pid){
        Map rs=fenleiService.getPid(pid);
        return rs;
    }

    @PostMapping("add")
    public Map add(Fenlei fenlei){
        Map map=fenleiService.add(fenlei);
      return map;
    }

    @PostMapping("update")
    public Map update(Fenlei fenlei){
        Map map=fenleiService.update(fenlei);
        return map;
    }

    @DeleteMapping("delete")
    public Map delete(Integer id){
        Map map=fenleiService.delete(id);
        return map;
    }

}
