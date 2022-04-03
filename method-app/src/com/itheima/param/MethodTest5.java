package com.itheima.param;

public class MethodTest5 {
    public static void main(String[] args) {
        // 需求：比较任意两个整数数组的内容是否一样，一样返回true,否则返回false。
        int[] arr1 = {11, 22, 33, 44};
        int[] arr2 = {11, 22, 33};
        System.out.println(compare(arr1, arr2));

    }
    /**
        定义一个方法，接收两个整形参数，返回值：布尔类型

     */
    public static boolean compare(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
