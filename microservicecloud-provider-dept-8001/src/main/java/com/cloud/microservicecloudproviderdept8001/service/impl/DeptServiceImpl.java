package com.cloud.microservicecloudproviderdept8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.microservicecloudapi.bean.Dept;
import com.cloud.microservicecloudproviderdept8001.mapper.DeptMapper;
import com.cloud.microservicecloudproviderdept8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

    @Autowired
    DeptMapper deptmapper;
    public  Dept selectById(Integer id){
        Dept dept = deptmapper.selectById(id);
        return dept;
    }
}
