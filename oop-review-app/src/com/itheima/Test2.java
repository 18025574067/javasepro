package com.itheima;

public class Test2 {
    public static void main(String[] args) {
        // 目标：复习this 的作用。
        Car c = new Car("布加迪威龙", 25000000);

        System.out.println(c.getName());
        System.out.println(c.getPrice());

        c.goWith("法拉利");
    }
}
