package com.itheima.createobject;

/**
    目标：学会设计对象并使用
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建对象
        Car c = new Car();
        c.name = "宝马";
        c.price = 38.8;
        System.out.println(c.name);
        System.out.println(c.price);
        c.run();
        c.start();

        System.out.println("-------------------");
        Car c1 = new Car();
        c1.name = "奔驰";
        c1.price = 39.9;
        System.out.println(c1.name);
        System.out.println(c1.price);
        c1.start();
        c1.run();

        System.out.println(c);
        System.out.println(c1);

    }
}
