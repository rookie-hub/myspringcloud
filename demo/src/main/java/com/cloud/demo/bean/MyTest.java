package com.cloud.demo.bean;

public class MyTest {
    public static void main(String[] args) {
        String str = "饿";
        Factory factory = null;
        if("饥饿".indexOf(str) != -1){
            factory = new RabbitFactory();
        }else {
            factory = new DogFactory();
        }

        factory.myinvoke();//INFO com.cloud.demo.bean.Rabbit - 兔子是用来填饱肚子的！！！
    }
}
