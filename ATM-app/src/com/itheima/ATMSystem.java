package com.itheima;

import java.util.ArrayList;
import java.util.Random;
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
                    login(accounts, sc);
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
     * 用户登录功能
     * @param accounts 所有账户的集合
     * @param sc 扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=================系统登录功能=====================");
        // 1. 先判断系统中是否有账户，如果没有提醒并退出
        if (accounts.size() == 0){
            System.out.println("对不起，当前系统无用户，请先注册再登录～～～");
            return; // 卫语言格式，解决方法的执行。
        }

        // 2. 正式进入登录操作
        while (true) {
            System.out.println("请输入登录卡号：");
            String cardId = sc.next();

            // 3. 判断用户是否存在, 根据卡号去集合中查询对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null){
                while (true) {
                    // 卡号存在
                    // 4. 让用户输入密码，并认证
                    System.out.println("请您输入密码：");
                    String passWord = sc.next();
                    // 判断密码是否正确
                    if (acc.getPassWord().equals(passWord)){
                        // 登录成功了
                        System.out.println("恭喜您：" + acc.getUserName() + "先生/女士登录成功，您的卡号为" + acc.getCardId());
                        // 可以开始查询，取款，转账 ...
                        showUserCommand(sc, acc, accounts);
                        return; // 干掉登录方法
                    }else {
                        System.out.println("您输入的密码有误，请重新输入：");
                    }
                }
            }else {
                System.out.println("对不起，系统中不存在此用户，请重新输入：");
            }
        }
    }

    /**
        展示用户操作页
     */
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("===============用户操作页=====================");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 查询操作(展示当前登录账户)
                    showAccount(acc);
                    break;
                case 2:
                    // 存款操作
                    depositMoney(acc, sc);
                    break;
                case 3:
                    // 取款操作
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // 转账操作
                    transferMoney(acc, sc, accounts);
                    break;
                case 5:
                    // 修改密码操作
                    updatePassWord(sc, acc);
                    System.out.println("请重新登录：");
                    return;
                case 6:
                    // 退出操作
                    System.out.println("退出成功，欢迎下次光临～～～");
                    return; // 干掉当前方法
                case 7:
                    // 销户操作
                    if (deleteAccount(sc, acc, accounts)){
                        // 销户成功，回到首面
                        return;
                    }else {
                        // 销户不成功，返回操作页
                        break;
                    }
                default:
                    System.out.println("您的输入有误！");
            }
        }
    }

    /**
     * 销户功能
     * @param sc 扫描器
     * @param acc 当前账户
     * @param accounts 所有账户的集合
     */
    private static boolean deleteAccount(Scanner sc, Account acc, ArrayList<Account> accounts) {
        System.out.println("=================账户注销功能=====================");
        System.out.println("您真的要跑路？ y/n");
        String rs = sc.next();
        switch (rs){
            case "y":
                // 真正要销户了，从账户集合中删除即可
                if (acc.getMoney() > 0){
                    System.out.println("当前账户有余额：" + acc.getMoney() + "，请先取款再销户！");
                }else {
                    accounts.remove(acc);
                    System.out.println("销户成功");
                    return true;
                }
                break;
            default:
                System.out.println("好的，当前账户保留。");
        }
        return false;
    }

    /**
     * 修改密码功能实现
     * @param sc 扫描器
     * @param acc 当前账户
     */
    private static void updatePassWord(Scanner sc, Account acc) {
        System.out.println("=================用户密码修改=====================");
        while (true) {
            System.out.println("请输入原密码：");
            String passWord = sc.next();
            // 1. 判断密码是否正确
            if (acc.getPassWord().equals(passWord)){
                // 密码正确
                while (true) {
                    System.out.println("请您输入新密码：");
                    String newPassWord = sc.next();
                    System.out.println("请您再次输入新密码：");
                    String okPassWord = sc.next();
                    if (okPassWord.equals(newPassWord)){
                        // 密码通过认证
                        acc.setPassWord(okPassWord);
                        System.out.println("密码修改成功。");
                        return; // 密码已经正确，退出死循环
                    }else {
                        System.out.println("您两次密码不一致！");
                    }
                }
            }else {
                System.out.println("对不起，密码错误，请重新输入：");
            }
        }
    }

    /**
     * 转账功能实现
     * @param acc 当前账户
     * @param sc 扫描器
     * @param accounts 存储所有账户的集合
     */
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("=================用户转账功能=====================");
        // 1. 判断集合中是否有两个账户
        if (accounts.size() < 2){
            System.out.println("当前系统中少于2个账户，请添加账户");
            return; // 结束当前方法
        }
        // 2. 判断账户中是否有钱
        if (acc.getMoney() == 0){
            System.out.println("对不起，您自己都钱，就别转账了～～");
            return; // 结束当前方法
        }
        while (true){
            // 3. 真正开始转账
            System.out.println("请您输入对方卡号：");
            String cardId = sc.next();
            // 4. 判断卡号是否存在
            Account account = getAccountByCardId(cardId, accounts);
            if (account == null){
                System.out.println("该账户不存在！");
            }else {
                // 5. 认证对方姓氏
                // 不能是自己的卡号
                if (cardId.equals(acc.getCardId())) {
                    System.out.println("对不起，您不能给自己转账");
                    continue; // 结束当前执行，死循环进入下一次
                }
                String userName = account.getUserName();
                String tip = "*" + userName.substring(1);
                System.out.println("请您输入[" + tip + "]的姓氏：");
                String surName = sc.next();
                // 认证姓氏通过，可以转账了
                if (userName.startsWith(surName)){
                    while (true){
                        // 6. 转账并修改余额
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        // 判断余额是否够
                        if (acc.getMoney() > money){
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("转账成功，您的余额为：" + acc.getMoney());
                            return;
                        }else {
                            System.out.println("您的余额不足，最多可以转账：" + acc.getMoney());
                        }
                    }
                }else {
                    System.out.println("对不起，您的输入有误");
                }
            }
        }
    }

    /**
     * 取款功能实现
     * @param acc 当前登录账户
     * @param sc 扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("=================用户取款功能=====================");
        // 1. 判断存款是否大于100元
        if (acc.getMoney() < 100){
            System.out.println("您的余额不足100元，不能取款！");
            return;
        }

        while (true) {
            // 2. 提示用户输入取款金额
            System.out.println("请您输入取款金额：");
            double money = sc.nextDouble();
            // 3. 判断取款是否超过余额
            if(money > acc.getMoney()){
                System.out.println("对不起，余额不足！当前余额为：" + acc.getMoney());
            }else {
                // 4. 判断是否超过当次限额
                if (money < acc.getQuotaMoney()){
                    // 可以取款了
                    System.out.println("取款：" + money + "元，谢谢使用！");
                    // 更新余额
                    acc.setMoney(acc.getMoney() - money);
                    showAccount(acc);
                    return;
                }else {
                    System.out.println("您的取款超过当次限额！每次最大可取：" + acc.getQuotaMoney() + "元。");
                }
            }
        }
    }

    /**
     * 存款功能
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("=================用户存款功能=====================");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();

        // 存款金额 = 原来的金额 + 存进去多少钱
        acc.setMoney(acc.getMoney() + money);

        System.out.println("恭喜您，存款成功，当前账户信息如下：");
        showAccount(acc);

    }

    /**
     * 展示当前登录用户信息
     */
    private static void showAccount(Account acc) {
        System.out.println("=================当前账户信息如下=====================");
        System.out.println("用户名：" + acc.getUserName());
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("取款限额：" + acc.getQuotaMoney());

    }

    /**
        用户注册功能的实现
     * @param accounts 接收的账户集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=================系统开户功能=====================");
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

        // 为账户随机生成一个8位卡号，与集合中的元素不重复(独立功能，做为方法)
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        // 3. 把账户对象添加到集合中去
        accounts.add(account);
        System.out.println("恭喜您，" + userName + "(先生/女士)， 您的账户开户成功，卡号为：" + cardId + ", 请妥善保管。");
    }

    /**
     * 为账户生成与其它账户卡号不相同的号码
     * @return 生成一个不重复的卡号
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        // 1. 生成 8 位数字
        while (true) {
            StringBuilder cardId = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                cardId.append(r.nextInt(10));
            }

            // 2. 判断这个卡号是否与账户卡号重复了
            Account acc = getAccountByCardId(cardId.toString(), accounts);
            if (acc == null){
                // 说明cardId没有重复，是一个新卡号，可以使用这个卡号作为新注册用户的卡号
                return cardId.toString();
            }
        }
    }

    /**
     * 根据卡号查询一个账户出来
     * @param cardId 卡号
     * @param accounts 全部账户的集合
     * @return 帐户卡号 | null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts){
        for (Account acc : accounts) {
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null; // 表示查无此账户
    }
}
