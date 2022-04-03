package com.itheima.string;

import java.util.Scanner;

/**
    练习题：手机号码屏蔽。
 */
public class StringExec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 键盘录入手机号码
        System.out.println("请您输入手机号码：");
        String tel = sc.next();
        // 截取前3位，后4位号码   18888888888
        String before = tel.substring(0, 3);
        String after = tel.substring(7);
        String s = "屏蔽后的手机号为：" + before + "****" + after;
        System.out.println(s);
    }
}
