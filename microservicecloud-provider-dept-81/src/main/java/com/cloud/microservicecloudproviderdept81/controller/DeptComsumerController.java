package com.cloud.microservicecloudproviderdept81.controller;

import com.cloud.microservicecloudapi.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/comsumer/dept")
public class DeptComsumerController {
    @Autowired
    RestTemplate restTemplate;

    private static String URL_PREFIX = "http://localhost:8001";

    @PostMapping("/add")
    public  boolean add(Dept dept){
        dept.setDbsource("java_123456");
        return restTemplate.postForObject(URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/byId/{id}")
    public  Dept selectById(@PathVariable Integer id){
        Dept dept = restTemplate.getForObject(URL_PREFIX+"/dept/byId/" +id,Dept.class);
        return dept;
    }

    @GetMapping("/list")
    public List<Dept> list(){
        List<Dept> list = restTemplate.getForObject(URL_PREFIX+"/dept/list/", List.class);
        return list;
    }
}
