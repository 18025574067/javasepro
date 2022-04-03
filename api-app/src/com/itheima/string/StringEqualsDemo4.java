package com.itheima.string;

import java.util.Scanner;

public class StringEqualsDemo4 {
    public static void main(String[] args) {
        // 1. 正确登录密码
        String okname = "itheima";
        String okpassword = "123456";

        // 2.请您输入帐户和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入帐户名：");
        String name = sc.next();
        System.out.println("请您输入密码：");
        String password = sc.next();

        // 3. 判断是否正确
        if (okname.equals(name) && okpassword.equals(password)){
            System.out.println("登录成功！");
        }else {
            System.out.println("用户名或密码错误！");}

        // 4. 忽略大小写的API，常用用于验证码
        String sysCode = "123AbCdEf";
        String code1 = "123aBcDeF";
        System.out.println(sysCode.equals(code1));
        System.out.println(sysCode.equalsIgnoreCase(code1));

    }
}
