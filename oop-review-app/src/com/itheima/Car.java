package com.itheima;

public class Car {
    private String name;
    private double price;

    public Car(String name, double price){
        // this代表了当前对象
        this.name = name;
        this.price = price;
    }

    public void goWith(String name){
        // 谁调用了this方法，this 就代表谁
        System.out.println(this.name + "正在和" + name + "比赛");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
