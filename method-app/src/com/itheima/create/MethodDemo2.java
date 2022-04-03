package com.itheima.create;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：学会方法的完整定义格式，并理解其调用及执行流程
//        System.out.println(sum(100, 200));
        int rs = add(100, 200);
        System.out.println("和是：" + rs);

        System.out.println("========================");
        int rs1 = add(200, 300);
        System.out.println("和是：" + rs1);


    }
    public static int add(int a, int b){
        int c = a + b;
        return c;
    }

}
