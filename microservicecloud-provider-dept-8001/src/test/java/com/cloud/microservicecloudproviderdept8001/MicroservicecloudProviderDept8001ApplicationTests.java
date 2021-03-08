package com.cloud.microservicecloudproviderdept8001;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class MicroservicecloudProviderDept8001ApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    DeptMapper deptmapper;
    @Test
    void contextLoads() {
        log.info("数据源的类型: "+dataSource.getClass());
        //数据源的类型: class com.alibaba.druid.pool.DruidDataSource
    }

}
