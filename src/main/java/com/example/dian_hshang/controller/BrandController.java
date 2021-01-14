package com.example.dian_hshang.controller;

import com.example.dian_hshang.model.po.Brand;
import com.example.dian_hshang.model.vo.StudentBy;
import com.example.dian_hshang.service.BrandService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("api/brand")
public class BrandController {

    @Resource
    public BrandService brandService;

    //图片
    @PostMapping("tupian")
    public Map<String,Object> tupian(MultipartFile file , HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String realPath = request.getServletContext().getRealPath("/");
        String savePath = realPath + "/images";
        File fileStroy = new File(savePath);
        boolean exists = fileStroy.exists();
        if (exists == false) {
            fileStroy.mkdirs();
        }
        String filename = file.getOriginalFilename();
        String string = UUID.randomUUID().toString();
        String substring = filename.substring(filename.lastIndexOf("."));
        String a = string + filename;

        try {
            FileInputStream is = (FileInputStream) file.getInputStream();
            FileOutputStream os = new FileOutputStream(fileStroy + "/" + a);
            byte[] bts = new byte[1024 * 2];
            while (is.read(bts) != -1) {
                os.write(bts);
            }
            os.close();
            is.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        map.put("code", 200);
        map.put("message", "success");
        map.put("data", "images/" + a);
        return map;
    }


    /*请求get
    * 路径 ：
    * */

    @GetMapping("list")
     public Map list(StudentBy studentBy){
         Map map=new HashMap();
         if (studentBy.getCurrpage()==null){
             map.put("code",400);
             map.put("message","下标不存在");
         }
        if (studentBy.getCurrpage()==null){
            map.put("code",401);
            map.put("message","条数不存在");
        }
        Map rs=brandService.list(studentBy);
        map.put("code",200);
        map.put("message","查询成功");
        map.put("data",rs);
        return map;
     }
    /*请求post
    * 路径：http://192.168.1.11:8082/api/brand/addBrand
    * */
     @PostMapping("addBrand")
    public Map addBrand(Brand brand){
         Map map=brandService.addBrand(brand);
       return map;
    }

    /*请求方式 post
    *路径 http://192.168.1.11:8082/api/brand/updateBrand
    * */
   @PostMapping("updateBrand")
    public Map updateBrand(Brand brand){
       Map map=brandService.updateBrand(brand);
        return map;
    }
    /*请求方式 delete
    * 路径 http://192.168.1.11:8082/api/brand/deleteBrand
    * */
    @DeleteMapping("deleteBrand")
    public Map deleteBrand(Integer id){
        Map map=brandService.deleteBrand(id);
        return map;
    }

    @PostMapping("queryById")
    public Map queryById(Integer id){
        Map map=brandService.queryById(id);
        return map;
    }

}
