package com.itheima.createobject;

/**
    目标：理解定义类的几个补充注意事项，为后续知识的学习做准备
 */
public class Test2 {
    public static void main(String[] args) {
        /* 1、类名首字母建议大写，满足"驼峰模式"，不能用关键字，
                必须是合法标识符，且有意义。*/
        /* 2、一个Java文件中可以定义多个class类，但只能一个类是public修饰，
                而且public修饰的类名必须成为代码文件名。
                注意：实际开发中还是建议一个代码文件只定义一个类。
                */
        /* 3、成员变量的完整定义格式是：修饰符 数据类型 变量名称 = 初始化值：
            一般无需指定初始化值，存在默认值。

            默认值的规则：
            byte short int long    0
            double float           0.0
            boolean                false
            String等引用类型         null
         */
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.flag);


    }
}
