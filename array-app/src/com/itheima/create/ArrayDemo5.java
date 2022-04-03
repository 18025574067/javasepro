package com.itheima.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目标：掌握动态初始化元素的初始值规则。
        // 1. 整形数组的元素默认值为0
        int[] arr = new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[9]);

        // 2. 字符数组的元素默认值是什么？
        char[] chars = new char[100];
        System.out.println(chars[0]);
        System.out.println(chars[99]);
        System.out.println((int) chars[0]);
        System.out.println((int) chars[99]);

        // 3. 浮点型的元素默认值是0.0
        double[] scores = new double[90];
        System.out.println(scores[0]);
        System.out.println(scores[89]);

        // 4.布尔型的数组
        boolean[] booleans = new boolean[90];
        System.out.println(booleans[0]);
        System.out.println(booleans[89]);

        // 5. 字符串类型的数组
        String[] strings = new String[90];
        System.out.println(strings[0]);
        System.out.println(strings[89]);
    }
}
