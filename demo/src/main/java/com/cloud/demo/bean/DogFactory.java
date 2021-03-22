package com.cloud.demo.bean;

public class DogFactory extends Factory{
    @Override
    public Animals creates() {
        return new Dog();
    }
}
