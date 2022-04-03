package com.itheima.param;

public class MethodTest4 {
    public static void main(String[] args) {
        // 目标：接收整形数组和目标元素值，返回目标元素其索引，不存在返回-1。
        // 3.定义数组，调用方法。
        int[] arr = {11, 22, 32, 21};
        int index = searchIndex(arr, 302);
        System.out.println("您查询的数据索引是：" + index);
    }

    /**
        1.定义一个方法，参数接收的数组，要查询的数据，返回值：整数
     */
    public static int searchIndex(int[] arr, int data){
        // 2.开始找出这个数据的索引
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }
}
