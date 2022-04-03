package com.itheima.demo;

public class Test11 {
    public static void main(String[] args) {
        // 使用方法计算1-N的累加和
        System.out.println("1-5的累加：" + sum(5));
        System.out.println("---------------------");
        int sum1 = sum(100);
        System.out.println("1-100的累加：" + sum1);
    }

    public static int sum(int num){
        int sum1 = 0;
        for (int i = 1; i <= num; i++) {
            sum1 += i;
        }
        return sum1;
    }

}

