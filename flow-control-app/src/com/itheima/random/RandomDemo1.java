package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Java提供的随机数类random
        // 1.导包
        // 2.创建随机数对象
        Random r = new Random();
        // 3.调用nextInt(边界数)方法，返回随机数
        for (int i = 0; i < 20; i++) {
            int date = r.nextInt(10); // 0-9, 包前不含后！
            System.out.println(date);
        }
        System.out.println("-----------------");
        // 输出1 - 10
        int date1 = r.nextInt(10);
        System.out.println(date1 + 1);
        System.out.println("-----------------");
        // 3-17
        for (int i = 0; i < 20; i++) {
            int date2 = r.nextInt(15);
            System.out.println(date2 + 3);
        }


    }
}
