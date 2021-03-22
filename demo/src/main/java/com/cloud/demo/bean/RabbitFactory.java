package com.cloud.demo.bean;

public class RabbitFactory extends Factory{
    @Override
    public Animals creates() {
        return new Rabbit();
    }
}
