package com.itheima.thisdemo;

/**
    目标：理解 this 关键字的作用
 */
public class Test {
    public static void main(String[] args) {
        // 创建汽车对象
        Car c = new Car();
        c.run();
        System.out.println(c);

        System.out.println("=========================");

        Car c2 = new Car("奔驰", 39.8);

        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.goWith("宝马");

    }
}
