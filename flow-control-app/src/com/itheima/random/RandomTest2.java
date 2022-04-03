package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        // 猜1-100数字
        // 1. 随机生成一个随机数
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        // 2. 使用一个死循环让用户去猜数，并给出提示
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您猜1个数字(1-100)：");
            int guessNumber = sc.nextInt();
            // 3. 判断数字是否正确
            if (guessNumber > luckNumber){
                System.out.println("您猜的数字过大了！");
            }else if (guessNumber < luckNumber){
                System.out.println("您猜的数字过小了！");
            }else {
                System.out.println("恭喜您，猜对了，去买单吧！");
                break;
            }
        }


    }
}
