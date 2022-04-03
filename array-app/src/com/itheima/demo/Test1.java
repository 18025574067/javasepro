package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        // 需求：数组元素求和
        // 1. 把这些数据用数组存起来
        int[] money = {12, 34, 56, 100, 8};

        // 3. 定义统计的变量
        int sum = 0;
        // 2. 遍历数组得到每个元素
        for (int i = 0; i < money.length; i++) {
            // 4.元素累加
            sum += money[i];
        }
        System.out.println("数组的元素和是：" + sum);
    }
}
