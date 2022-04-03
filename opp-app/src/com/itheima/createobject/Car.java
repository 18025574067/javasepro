package com.itheima.createobject;

public class Car {
    /**
        成员名称
     */
    String name;
    double price;

    /**
        方法
     */

    public void start(){
        System.out.println(name + "启动了。");
    }

    public void run(){
        System.out.println("价格为：" + price + "万元的"
                + name + "跑很快！");
    }
}
