package com.itheima.loop;

public class ForTest2 {
    public static void main(String[] args) {
        // 需求：计算1-5的和
        // 2.定义一个变量用于累加和
        int sum = 0;

        // 1. 定义一个循环找到1,2,3,4,5
        for (int i = 1; i <= 5; i++) {
            // 3.把循环的数据累加给sum
            sum += i;
        }
        System.out.println("1-5的累加和为：" + sum);
    }
}
