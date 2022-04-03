package com.itheima.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        // 目标：学会使用逻辑运算符，并能选择合适的逻辑运算符解决问题。
        double size = 9.8;
        double storage = 6;

        // 需求：屏幕大于等于6.95, 内存大于等于8GB。
        // & 必须同时满足才能返回true.
        System.out.println(size >= 6.95 & storage >= 8);

        // 需求：要么屏幕大于等于6.95, 要么内存大于等于8GB。
        // 只要一个是true, 结果就是true.
        System.out.println(size >= 6.95 | storage >= 8);

        System.out.println(!true);
        System.out.println(!false);

        // 逻辑异或, 必须两个不同结果才是true
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(true ^ true); // false

        System.out.println("------------------| || & && 的区别-----------------------");



    }
}
