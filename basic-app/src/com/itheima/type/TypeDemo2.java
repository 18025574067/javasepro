package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 目标：掌握表达式的自动类型转换的规则

        byte a = 10;
        int b = 200;
        double c = 2.453;
        double d = a + b + c;
        System.out.println(d);

        // 面试题
        byte i = 10;
        byte j = 20;
        int k = i + j;


    }
}
