package com.itheima.loop;

public class ForTest3 {
    public static void main(String[] args) {
        // 求1-10的奇数和
        // 3. 定义一个求和的变量 累加奇数和
        int sum = 0;

        // 1.定义一个循环找到1,2,3,...10
        for (int i = 1; i <= 10; i++) {
            // 2. 筛选出奇数
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("1-10的奇数和：" + sum);

        System.out.println("-------------另一种方式----------------");
        int sum1 = 0;
        for (int i = 1; i <=10 ; i+=2) {
            sum1 += i;
        }
        System.out.println("1-10的奇数和：" + sum1);
    }
}
