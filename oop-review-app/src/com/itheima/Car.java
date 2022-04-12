package com.itheima;

public class Car {
    private String name;
    private double price;

    public Car(String name, double price){
        name = name;
        price = price;
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
