package com.itheima.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        // 目标：理解强制类型转换，并使用
        int a = 20;
//        byte b = a; //报错
        byte b = (byte) a;
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j); // 强制类型转换可能会造成数据丢失（溢出）

        double score = 99.5;
        int it = (int) score;
        System.out.println(it); // 浮点型转换整形，会丢掉小数部分


    }
}
