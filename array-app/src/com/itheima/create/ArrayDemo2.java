package com.itheima.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标：学会访问数组的元素
        int[] ages = {23, 24, 44};

        // 取值 数组[索引值]
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        // 赋值 数组名称[索引值] = 数据
        ages[2] = 33;
        System.out.println(ages[2]);
    }
}
