package com.itheima.constructor;

/**
    目标：认识构造器，明白两种类型的构造器作用
 */
public class Test {
    public static void main(String[] args) {
        // 通过调用构造器得到对象
        Car c = new Car();
        c.name = "宝马";
        c.price = 38.9;
        System.out.println(c.name);
        System.out.println(c.price);

        System.out.println("=========================");
        Car c1 = new Car("奔驰", 39.9);
        System.out.println(c1.name);
        System.out.println(c1.price);


    }
}
