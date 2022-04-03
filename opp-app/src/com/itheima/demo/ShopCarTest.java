package com.itheima.demo;

import java.util.Scanner;

/**
    目标：面向对象编程训练，购物车模块模拟。
 */
public class ShopCarTest {
    public static void main(String[] args) {
        // 定义商品类，用于后期创建商品对象
        // 定义购物车对象，使用一个数组对象表示
        Goods[] shopCar = new Goods[100]; //[null, null, null ...]
        Scanner sc = new Scanner(System.in);
        // 搭建操作框架
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车： add");
            System.out.println("查询商品价格： query");
            System.out.println("修改购物商品数量： update");
            System.out.println("结算购买商品的金额： pay");
            System.out.println();
            System.out.println("请您输入命令：");
            String command = sc.next();
            switch (command) {
                case "add":
                    // 添加商品到购物车
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    // 查询商品价格
                    queryGoods(shopCar);
                    break;
                case "update":
                    // 修改购买数量
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    // 商品结算
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没有该功能!");
            }
        }
    }

    public static void pay(Goods[] shopCar) {
        queryGoods(shopCar);
        // 1. 定义一个求和变量累加变量
        double money = 0;
        // 2. 遍历购物车中的全部商品对象，累加单价和数量。
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                money += (g.buyNumber * g.price);
            }else {
                break;
            }
        }
        System.out.println("订单总金额：" + money);
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        // 让用户输入要修改商品的id, 根据id查询到要修改的商品数量
        while (true) {
            System.out.println("请输入要修改数量的商品id: ");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if (g != null) {
                // 找到商品, 可以修改
                System.out.println("请您输入：" + g.name + "要修改的数量：");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("商品数量修改成功！");
                queryGoods(shopCar);
                break;
            } else {
                // 没有该商品。
                System.out.println("没有购买该商品！");
            }
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g != null){
                if(g.id == id){
                    return g;
                }
            }else {
                return null; // 找完了全部存在的商品，都没有找到。
            }
        }
        return null; // 代表找遍了100个都没有找到要找的id。
    }

    /**
        查询购物车中的商品信息并展示出来
     */
    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=================购物车商品信息===================");
        System.out.println("编号\t\t 名称\t\t\t 价格\t\t\t 数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null){
                // 展示商品信息
                System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.price + "\t\t\t" + g.buyNumber);
            }else {
                // 遍历结束
                break;
            }
        }
    }

    /**
        完成商品添加到购物车的功能
     */
    public static void addGoods(Goods[] shopCar, Scanner sc) {
        // 1.录入用户输入的购买商品的信息。
        System.out.println("请输入购买商品的ID（不重复）:");
        int id = sc.nextInt();
        System.out.println("请输入购买商品的名称:");
        String name = sc.next();
        System.out.println("请输入购买商品的价格:");
        double price = sc.nextDouble();
        System.out.println("请输入购买商品的数量:");
        int buyNumber = sc.nextInt();

        // 2. 把这些商品信息封装成一个商品对象
        Goods g = new Goods();
        g.name = name;
        g.id = id;
        g.price = price;
        g.buyNumber = buyNumber;

        // 3. 把这个商品对象添加到购物车数组中去。
        // shopCar = [a, b, null ...]
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i] == null){
                // 说明此处没有商品，可以添加到此处
                shopCar[i] = g;
                break; // 结束，说明此处己添加，不需要再找位置。
            }
        }
        System.out.println("您的商品：" + g.name + " 添加到购物车成功。");
    }
}
