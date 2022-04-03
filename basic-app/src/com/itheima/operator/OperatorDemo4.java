package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标：学会使用自增自减运算符：++ --。
        int a = 10;
//        a++; // a = a + 1
        ++a;
        System.out.println(a);

        int b = 10;
//        b--; // b = b - 1
        --b;
        System.out.println(b);

        System.out.println("---------------------------------------");
        // 在表达式中或不是单独操作的情况，++ --放在变量前后存在区别；
        // ++ -- 放在变量前面，先+1, -1再使用
        int i = 10;
        int j = ++i;
        System.out.println(j); // 11
        System.out.println(i); // 11

        // ++ -- 放在变量后面，先使用再 +1, -1。
        int m = 10;
        int n = m--;
        System.out.println(m); // 9
        System.out.println(n); // 10

        System.out.println("---------------拓展案例（可以了解和参考）---------------");
        int k = 3;
        int p = 5;
        int rs = k++ + ++k - --p + p-- - k-- + ++p +2;
        // k 3 4 5 4
        // p 5 4 3 4
        // rs 3 + 5 - 4 + 4 - 5 + 4 + 2 = 9
        System.out.println(k); // 4
        System.out.println(p); // 4
        System.out.println(rs); // 9





    }
}
