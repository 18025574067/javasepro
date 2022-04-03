package com.itheima.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        // 目标：学会使用三元运算符，理解其流程
        double score = 98;
        String rs = score >= 60 ? "考试通过": "挂科";
        System.out.println(rs);

        // 需求：从两个整数中找出最大值
        int a = 20;
        int b = 50;
        int rsMax = a > b ? a : b;
        System.out.println(rsMax);

        System.out.println("---------------3个整数找出最大值-----------------------");
        int i = 80;
        int j = 30;
        int k = 50;
        // 1. 找出2个整数的最大值
        int temp = i > j ? i : j;
        // 2. 拿临时变量与第3个值继续比较
        int max = temp > k ? temp : k;
        System.out.println(max);

        System.out.println("------------------拓展知识---------------------");
//        int rsMax1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
        int rsMax1 = i > j ? i > k ? i : k : j > k ? j : k;
        System.out.println(rsMax1);

    }

}
