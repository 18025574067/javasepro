package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 需求：5个1-20之间的随机数，让用户猜，猜中要提示猜中，还要输出该数据在数组中第一次出现的索引，并打印数组的内容出来
        // 没有猜中继续

        // 1. 定义一个动态初始化的数组存储5个随机的1-20之间的数据
        int[] data = new int[5];

        // 2. 动态的生成5个1-20随机数存储到数组中
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
        }

        // 3. 使用一个死循环让用户猜测
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请您输入一个1-20的整数进行猜测：");
            int guessData = sc.nextInt();

            // 4. 遍历数组中的每个元素，看数据是否有与用户猜测的结果，相同代表猜中，给出提示
            for (int i = 0; i < data.length; i++) {
                if (guessData == data[i]){
                    System.out.println("运气不错，你猜中了，猜中的随机数索引值是：" + i);
                    break OUT; // 结束整个循环，代表游戏结束了。
                };
            }
            System.out.println("您猜错了，请重新猜：");
            
        }
        System.out.print("5个随机数为： ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
