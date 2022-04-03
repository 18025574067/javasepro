package com.itheima.loop;

public class DoWhileDemo7 {
    public static void main(String[] args) {
        // 目标：学会使用do-while循环，并理解其流程
        int i = 0;
        do {
            System.out.println("hello world");
            i++;
        }while (i < 3);

        System.out.println("---------------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("hello world");
        }
        System.out.println("---------------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("hello world");
        }
        System.out.println("---------------------------");
        int n = 0;
        while (n < 3){
            System.out.println("hello world");
            n++;
        }
        System.out.println(n);
    }
}
