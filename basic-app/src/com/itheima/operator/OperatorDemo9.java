package com.itheima.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        // 目标：看看java是否存在优先级，大家以后需要注意优先级的问题

        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3); // false
    }

}
