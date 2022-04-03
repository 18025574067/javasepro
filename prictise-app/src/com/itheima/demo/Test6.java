package com.itheima.demo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 需求：数据加密
        // 1. 定义一个数组存入需要加密的数据
        System.out.println("请输入需要加密的数字个数：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        // 2. 录入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入要第"+ (i+1) +"个加密的数字");
            int number = sc.nextInt();
            arr[i] = number;
        }

        // 3. 打印数组内容看一下;
        printArray(arr);

        // 4. 核心逻辑（对数组的数字进行运算） arr = {1, 3, 5, 4}; arr = {6, 8, 0, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        // 5. 核心逻辑（对数组的数字进行反转） arr = {6, 8, 0, 9} ; arr = {9, 0, 8, 6};
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
        System.out.println("加密同时也可以解密");
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i]: arr[i] + ", ");
        }
        System.out.println("]");
    }
}
