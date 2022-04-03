package com.itheima.demo;

public class Test5 {
    public static void main(String[] args) {
        // 冒泡排序
        // 1. 定义一个数组，存储一组数据
        int[] arr = {2, 4, 3, 7, 1};
        //           0  1  2  3  4

        // 2. 定义一个循环控制比较的轮数
//        for (int i = 1; i <= arr.length - 1; i++) {
        for (int i = 0; i < arr.length - 1; i++) {
            // i == 1 比较的次数 3 j = 0 1 2
            // i == 2 比较的次数 2 j = 0 1
            // i == 3 比较的次数 2 j = 0
            // 3. 定义一个循环控制每轮比较的次数，占位
//            for (int j = 0; j < arr.length - i; j++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                // 判断j 当前位置的元素值，是否大于后一个位置 若较大 则交换
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 4. 遍历输出结果
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + "\t");
            i++;
        }
    }
}
