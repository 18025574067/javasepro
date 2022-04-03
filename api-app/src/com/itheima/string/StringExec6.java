package com.itheima.string;

import java.util.Random;

/**
    练习题：使用String完成随机生成5位验证码。
 */
public class StringExec6 {
    public static void main(String[] args) {
        // 1. 定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        // 2. 循环5次，生成一个随机的索引，提取对应的字符连接起来
        Random r = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i <5; i++) {
            // 随机一个索引
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code.append(c);
        }

        // 3. 输出验证码
        System.out.println(code);

    }
}
