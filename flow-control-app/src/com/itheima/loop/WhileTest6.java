package com.itheima.loop;

public class WhileTest6 {
    public static void main(String[] args) {
        // 需求：珠穆朗玛高度8848.86米，纸张厚度0.1毫米，折叠纸张直到不低于珠峰高度，求折叠几次?
        // 1. 定义变量记录山峰高度，纸张厚度
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        // 3. 定义一个变量记录折叠的次数
        int count = 0;

        // 2. 定义一个while循环控制纸张折叠
        while (paperThickness < peakHeight){
//        for( ;paperThickness < peakHeight; ){
            paperThickness *= 2;
            count++;
        }
        System.out.println("纸张折叠的次数：" + count);
        System.out.println("纸张的最后厚度为：" + paperThickness);
    }
}
