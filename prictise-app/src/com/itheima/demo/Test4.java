package com.itheima.demo;

/**
    目标：把一个数组复制到一个新数组中
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        int[] arr1 = arr; //没有完成了数组的复制。
        int[] arr2 = new int[arr.length];

        copy(arr, arr2);

        printArray(arr);
        printArray(arr2);
    }
    public static void copy(int[] arr, int[] arr2){
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
    }
    public static void printArray(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1? arr[i]: arr[i] + ", ");
        }

        System.out.println("}");
    }
}
