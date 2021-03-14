package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MicroservicecloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudApiApplication.class, args);
    }

}
