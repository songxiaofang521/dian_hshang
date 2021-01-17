package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Fenlei;
import com.example.dian_hshang.model.vo.ReponseData;
import com.example.dian_hshang.service.FenleiService;
import com.example.dian_hshang.util.OssFileUtils_sxf;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;
import java.util.UUID;
import java.io.IOException;


@CrossOrigin
@RestController
@RequestMapping("api/type/")
public class FenleiController {

    @Resource
    public FenleiService fenleiService;


    public ReponseData uploadFile(MultipartFile file) throws IOException {
        //处理新名称
        String originalFilename = file.getOriginalFilename();
        //防止中文引起的错误
       String  newName= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        //存储路径
        newName="imgs/"+newName;
        return ReponseData.success(OssFileUtils_sxf.uploadFile(file.getInputStream(),newName));
    }

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
