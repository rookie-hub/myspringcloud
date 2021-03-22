package com.cloud.demo.bean;

public abstract class Factory {
    public abstract Animals creates();
    public  void  myinvoke(){
        Animals animals = creates();
        animals.description();
    }
}
