package com.cloud.controller;

import com.cloud.bean.Dept;
import com.cloud.service.DeptServicess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptControllerss {

    @Autowired
    private DeptServicess deptService;

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
