package com.itheima.param;

public class MethodTest3 {
    public static void main(String[] args) {
        // 需求：打印任意整数数组的内容
        // [10, 20, 30,40]
        int[] ages = {10, 12, 13, 15};
        printArray(ages);
        System.out.println("-----------------");

        int[] number = {100, 120, 130, 150};
        printArray(number);
        System.out.println("-----------------");

        int[] number1 = null;
        printArray(number1);

    }
    public static void printArray(int[] arr){
        System.out.print("[");
        if (arr != null && arr.length > 0){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length -1? arr[i]: arr[i] + ", ");
//
//            if (i == arr.length -1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            }
        }

        System.out.println("]");

    }
}
