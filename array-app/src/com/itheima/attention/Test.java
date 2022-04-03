package com.itheima.attention;

public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};

        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        arr = null;
        System.out.println(arr);
        System.out.println(arr.length);


        System.out.println("程序执行完毕");
    }
}
