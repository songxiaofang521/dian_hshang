package com.example.dian_hshang.service.impl;

import com.example.dian_hshang.dao.GoodsvalueDao;
import com.example.dian_hshang.service.GoodsvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsvalueServicelmpl implements GoodsvalueService {

    @Resource
    public GoodsvalueDao goodsvalueDao;
}
