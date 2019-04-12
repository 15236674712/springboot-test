package com.baizhi.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController {

    @Autowired
    DruidDataSource druidDataSource;

    @RequestMapping("testDat")
    public String TestDat(){

        return "index";
    }
}
