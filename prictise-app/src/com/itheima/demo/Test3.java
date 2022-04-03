package com.itheima.demo;

import java.util.Random;

/**
    定义方法实现生成5位的随机验证码，字符可以是数字，大写字母，小写字母。

 */
public class Test3 {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println("随机验证码：" + code);
    }

    // 1. 定义一个随机产生验证码的方法，是否需要返回值？ String 是否需要形参？ int n
    public static String createCode(int n){
        // 4.定义一个字符串来记录随机字符。
        String code = "";

        // 2. 定义一个for 循环，循环n 次，依次生成随机数
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            // 3. 生成一个随机字符，英文大写，小写，数字。（0, 1, 2）
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    // 大写字符 A 65 - Z 65+25
                    char ch = (char)(r.nextInt(26) + 65);
                    code += ch;
                    break;

                case 1:
                    // 小写字符 a 97 - z 97+25
                    char ch1 = (char)(r.nextInt(26) + 97);
                    code += ch1;
                    break;

                case 2:
                    // 数字字符
                    code += r.nextInt(10); // 0-9
                    break;

            }
        }
        return code;
    }
}
