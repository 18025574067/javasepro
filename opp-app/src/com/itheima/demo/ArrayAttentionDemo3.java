package com.itheima.demo;

public class ArrayAttentionDemo3 {
    public static void main(String[] args) {
        // 目标：理解数组的注意事项
        // 1. 数据类型[] 数组名称 也可以写成 数据类型 数组名称[]
        int[] ages = {11, 23, 45};
//        int agees1[] = {11, 23, 45};

        // 2. 什么类型的数组只能存放什么类型的元素
//        String[] name = {"老王", "小李", 11};

        // 3. 数组一旦定义之后，其类型和长度就固定了
//        System.out.println(ages[3]); // 报错，索引越界

    }
}
