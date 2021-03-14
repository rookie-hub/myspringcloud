package com.cloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(value="com.cloud.**")
class MicroservicecloudProviderDept8002ApplicationTests {

    @Test
    void contextLoads() {
    }

}
