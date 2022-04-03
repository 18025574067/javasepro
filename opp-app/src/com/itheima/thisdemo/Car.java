package com.itheima.thisdemo;

public class Car {
    String name;
    double price;

    /**
        无参数构造器
     */
    public Car(){
        System.out.println("这是一个无参数构造器的this:  " + this);
    }

    public Car(String name, double price){
        // 注意：在构造器中，this代表构造器正在初始化这个对象。
        this.name = name;
        this.price = price;
    }

    public void run(){
        // 注意：this在方法中，谁调用该方法就代表谁。
        System.out.println("这是一个方法的this:  " + this);
    }

    public void goWith(String name){

        System.out.println(this.name + "正在和" + name + "比赛。");
    }
}
