package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后注册进eureka服务中心
@MapperScan("com.cloud.mapper")
public class MicroservicecloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
    }

}
