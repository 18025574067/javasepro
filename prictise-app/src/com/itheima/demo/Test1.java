package com.itheima.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 目标：完成买飞机票的价格计算
        // 1. 提示用户输入原价，月份，仓位类型

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double money = sc.nextDouble();

        System.out.println("请您输入购买机票的月份(1-12)：");
        int month = sc.nextInt();


        System.out.println("请您输入仓位类型：");
        String tape = sc.next();

        System.out.println("机票优惠后的价格是：" + calc(money, month, tape));
    }

    /**
        2.定义方法接收用户输入信息，返回优惠后的价格返回

     */
    public static double calc(double money, int month, String tape){
        // 3. 判断用户选择的信息情况。
        if(month >= 5 && month <= 10){
            switch (tape){
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位类型有误！");
                    money = -1;
            }

        }else if(month == 11 || month == 12 || month >= 1 && month <= 4){
            switch (tape){
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位类型有误！");
                    money = -1;
            }
        }else {
            System.out.println("您输入的月份有误！");
            money = -1; // 表示金额无法计算！
        }
        return money;
    }

}
