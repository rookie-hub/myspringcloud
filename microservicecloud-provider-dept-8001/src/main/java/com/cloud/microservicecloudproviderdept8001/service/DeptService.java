package com.cloud.microservicecloudproviderdept8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.microservicecloudapi.bean.Dept;

public interface DeptService extends IService<Dept> {
    public  Dept selectById(Integer id);
}
