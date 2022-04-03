package com.itheima.operator;

public class OperatorTest2 {
    public static void main(String[] args) {
        // 需求：拆分3位数，分别输出个位数，十位数，百位数。

        int date = 589;

        // 个位数
        System.out.println(date % 10);

        // 十位数
        System.out.println(date / 10 % 10);

        // 百位数
        System.out.println(date / 100);
    }
}
