package com.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.bean.Dept;

public interface DeptService extends IService<Dept> {
    public  Dept selectById(Integer id);
}
