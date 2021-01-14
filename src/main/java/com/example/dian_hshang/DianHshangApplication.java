package com.example.dian_hshang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dian_hshang.dao")
public class DianHshangApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianHshangApplication.class, args);
    }

}
