package com.cloud.microservicecloudproviderdept8001.controller;

import com.cloud.microservicecloudapi.bean.Dept;
import com.cloud.microservicecloudproviderdept8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 添加数据
     * @param dept
     * @return
     */
    @PostMapping("/add")
    public  boolean add(@RequestBody Dept dept){
        boolean save = deptService.save(dept);
        return save;
    }

    @GetMapping("/byId/{id}")
    public  Dept selectById(@PathVariable Integer id){
        Dept dept = deptService.selectById(id);
        return dept;
    }
    @GetMapping("/list")
    public List<Dept> list(){
        List<Dept> list = deptService.list();
        return list;
    }

}
