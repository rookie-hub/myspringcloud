package com.cloud.demo.bean;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Dog implements Animals{
    @Override
    public void description() {
        log.info("单身狗是不吃狗粮的！！！");
    }
}
