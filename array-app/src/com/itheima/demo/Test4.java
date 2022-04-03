package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 目标：键盘录入一组工号，最终随机生成顺序输出

        // 1. 动态初始化一组数组，存储5个工号
        int[] codes = new int[5];

        // 2. 定义一个循环5次，依次录入工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            // 正式录入工号
            System.out.println("请输入第" + (i + 1) + "个工号");
            int code = sc.nextInt();
            codes[i] = code;
        }
        // 3. 遍历数组中的每个元素，然后随机一个索引，让该元素与随机索引位置值进行变换（本节的重点）
        // codes = [12, 36, 28, 56, 99]
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            // 当前遍历的元素值 codes[i]
            // 随机一个索引位置出来 codes [index]
            int index = r.nextInt(codes.length);

            // 定义一个临时变量存储index的值
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }

        // 4. 遍历数组输出随机排序
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}