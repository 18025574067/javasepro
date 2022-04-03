package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 学会使用赋值运算符：= += -= ×= /= %=。
        int a = 10;
        int b = 200;
//        a = a + b;
        a += b; // a = (int)(a + b)
//        System.out.println(a);

        byte i = 10;
        byte j = 2;
//        i = i + j;
        i += j; // i = (byte)(i + j)
//        System.out.println(i);

        int m = 10;
        int n = 5;
//        m += n; // m = (int)(m + n)
//        m -= n; // m = (int)(m - n)
//        m *= n; // m = (int)(m * n)
//        m /= n; // m = (int)(m / n)
        m %= n; // m = (int)(m % n)


        System.out.println(m);


    }
}
