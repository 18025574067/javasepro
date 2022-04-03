package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        // 目标：数组元素求最值

        // 1. 定义静态初始化数组存储一组颜值
        int[] faceScore = {5, 9000, 10000, 20000, 9500, -5};

        // 2. 定义一个变量存储最大值，建议选第一个值
        int max = faceScore[0];

        // 3. 遍历数组的每个元素，依次与最大值做比较，若最大，则替换
        for (int i = 1; i < faceScore.length; i++) {
            if (faceScore[i] > max){
                max = faceScore[i];
            }
        }
        // 4. 输出最大值
        System.out.println("颜值最大值为：" + max);
    }
}
