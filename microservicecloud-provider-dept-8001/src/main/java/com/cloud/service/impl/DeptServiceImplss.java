package com.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.bean.Dept;
import com.cloud.mapper.DeptMapperss;
import com.cloud.service.DeptServicess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImplss extends ServiceImpl<DeptMapperss, Dept> implements DeptServicess {

    @Autowired
    DeptMapperss deptmapper;
    public  Dept selectById(Integer id){
        Dept dept = deptmapper.selectById(id);
        return dept;
    }
}
