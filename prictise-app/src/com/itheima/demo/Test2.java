package com.itheima.demo;

/**
    需求：找出101-200之间的素数。
    素数：除了1和它本身，不能被其他正整数整除，就叫素数。
 */
public class Test2 {
    public static void main(String[] args) {
        //1. 定义一个循环，找出101-200的所有整数
        for (int i = 101; i <= 200; i++) {
            // i = 101, 102, 103, ... 199, 200;

            // 信号位：标记 flag
            boolean flag = true; // 认为一开始就是素数
            // 2. 判断当前遍历的数据是否是素数
            for (int j = 2; j < i/2; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            // 3. 根据判定是否输出这个数据。
            if(flag){
                System.out.print(i + "\t");
            }
        }
    }

}
