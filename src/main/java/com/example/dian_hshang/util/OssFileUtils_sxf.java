package com.example.dian_hshang.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;

import java.io.InputStream;

public class OssFileUtils_sxf {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    private static String endpoint = "oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    private static String accessKeyId = "LTAI4G7RqGGVEb5TBpBws6nA";
    private static String accessKeySecret = "zcailAdEMrTJrjEcBESC742rccIo9H";
    private static String bucket = "tdyty";

    public static String uploadFile(InputStream is, String fileName) {
        //下载jar包
        //创建工具类
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //调用上传方法
        PutObjectResult putObjectResult = ossClient.putObject(bucket, fileName, is);
        //判断是否上传成功
        //释放资源
        ossClient.shutdown();
        //返回文件的存储路径
        return "https://" + bucket + "." + endpoint + "/" + fileName;

    }

}