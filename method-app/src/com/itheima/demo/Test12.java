package com.itheima.demo;

public class Test12 {
    public static void main(String[] args) {
        // 目标：使用方法判断整数为奇偶数并输出
        check(20);
        System.out.println("--------------------------");
        check(13);
    }

    public static void check(int num){
        if (num % 2 == 1){
            System.out.println("整数" + num + "是奇数");
        }else {
            System.out.println("整数" + num + "是偶数");
        }
    }
}
