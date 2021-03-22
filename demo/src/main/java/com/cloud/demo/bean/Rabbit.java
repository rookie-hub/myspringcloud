package com.cloud.demo.bean;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Rabbit implements Animals{
    @Override
    public void description() {
        log.info("兔子是用来填饱肚子的！！！");
    }
}
