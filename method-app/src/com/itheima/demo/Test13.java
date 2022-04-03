package com.itheima.demo;

public class Test13 {
    public static void main(String[] args) {
        // 方法求数组最大值
        int[] array = {12, 34, 45, 56, 3, 100};
        System.out.println(getArrayMaxData(array));
    }
    public static int getArrayMaxData(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
