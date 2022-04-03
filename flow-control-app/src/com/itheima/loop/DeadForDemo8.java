package com.itheima.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
        // 目标：学会使用死循环

//        for (;;){
//            System.out.println("hello world");
//        }

        // 经典写法
//        while (true){
//            System.out.println("hello world");
//        }

//        do {
//            System.out.println("hello world");
//        }while (true);

        System.out.println("-----------------------------------");
        // 1. 定义一个正确的密码
        int okPassword = 520;
        Scanner sc = new Scanner(System.in );

        // 2. 定义一个死循环让客户不断的输入密码
        while (true){
            System.out.println("请输入密码：");
            int password = sc.nextInt();
            if (password == okPassword){
                System.out.println("密码正确，登录成功。");
                break; // 可以理解为中止当前循环
            }else {
                System.out.println("密码错误，请重新输入：");
            }
        }
    }
}
