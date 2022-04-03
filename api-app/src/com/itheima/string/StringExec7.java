package com.itheima.string;

import java.util.Scanner;

/**
    练习题：模拟用户登陆

 */
public class StringExec7 {
    public static void main(String[] args) {
        //1. 定义正确的登录帐户和密码
        String okLoginName = "admin";
        String okPassword = "itheima";

        // 2. 定义一个3次的循环，让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String loginName = sc.next();
            System.out.println("请输入密码：");
            String passwork = sc.next();

            // 3. 判断登录名是否正确
            if (okLoginName.equals(loginName)){
                // 4. 判断密码是否正确
                if (okPassword.equals(passwork)){
                    System.out.println("登录成功～～～～～～～～～～～～～");
                    break;
                }else {
                    System.out.println("登录密码错误！您还有" + (3-i) + "次机会：");
                }
            }else {
                System.out.println("登录名错误！您还有" + (3-i)+ "次机会：");
            }
        }
    }
}
