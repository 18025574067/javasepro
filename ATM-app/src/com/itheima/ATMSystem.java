package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

/**
    ATM系统的入口类。
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1. 定义账户类
        // 2. 定义一个集合容器，用于后期存储用户对象，进行相关的业务操作。
        ArrayList<Account> accounts = new ArrayList<>();

        // 3. 展示系统的首页（欢迎页）
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============铜盂忠诚ATM系统==============");
            System.out.println("1. 账户登录");
            System.out.println("2. 注册账户");
            System.out.println("请您进行操作： ");

            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 用户登录
                    break;
                case 2:
                    // 用户注册(ALT + ENTER)
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作不存在！！");
            }
        }
    }

    /**
        用户开启功能的实现
     * @param accounts 接收的账户集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=================系统开启功能=====================");
        // 1. 创建账户对象，用于后期封装账户信息
        Account account = new Account();

        // 2. 录入这个账户的信息，注入到账户对象中去
        System.out.println("请您输入账户的用户名：");
        String userName =  sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请您输入账户的密码：");
            String passWord = sc.next();
            System.out.println("请您再次输入账户的密码：");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)){
                // 密码通过认证
                account.setPassWord(okPassWord);
                break; // 密码已经正确，退出死循环
            }else {
                System.out.println("您再次输入的密码再次不一致！");
            }
        }
        System.out.println("请您输入当日限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 3. 为账户随机生成一个8位卡号，与集合中的元素不重复
        String cardId = getRandomCardId();


        // 3. 把账户对象添加到集合中去


    }

    /**
     * 为账户生成与其它账户卡号不相同的号码
     * @return
     */
    private static String getRandomCardId() {
        // 1. 生成 8 位数字
        String CardId = "";
        for (int i = 0; i < 8; i++) {

        }

        return null;
    }
}
