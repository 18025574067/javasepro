package com.itheima.param;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：理解引用类型的参数传递机制，值传递，区分其不同。

        int[] arrs = {11, 22, 33};
        change(arrs);
        System.out.println(arrs[1]); // 44
    }

    public static void change(int[] arrs){
        System.out.println(arrs[1]); // 22
        arrs[1] = 44;
        System.out.println(arrs[1]); // 44

    }
}
