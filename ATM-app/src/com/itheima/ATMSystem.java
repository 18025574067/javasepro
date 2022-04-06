package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

/**
    ATM系统的入口类。
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1. 定义账户类
        // 2. 定义一个集合容器，用于后期存储用户对象，进行相关的业务操作。
        ArrayList<Account> accounts = new ArrayList<>();

        // 3. 展示系统的首页（欢迎页）
        System.out.println("=============黑马ATM系统==============");
        System.out.println("1. 账户登录");
        System.out.println("2. 注册账户");
        Scanner sc = new Scanner(System.in);
        System.out.println("请您进行操作： ");

        int command = sc.nextInt();
        switch (command){
            case 1:
                // 用户登录
                break;
            case 2:
                // 用户注册
                break;
            default:
                System.out.println("您输入的操作不存在！！");
        }
    }
}
