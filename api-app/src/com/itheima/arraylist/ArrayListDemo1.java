package com.itheima.arraylist;

import java.util.ArrayList;

/**
    目标：创建ArrayList对象，代表集合窗器，往里面添加元素。
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1. 创建ArrayList集合的对象
        ArrayList list = new ArrayList();

        // 2. 添加元素
        list.add("java");
        list.add("MYSQL");
        list.add("Python");
        list.add("java");
        list.add("铜盂忠诚汽修厂");
        list.add("黑马");
        list.add(100);
        System.out.println(list.add(232.55));

        System.out.println(list);

        // 3.给指定位置插入数据
        list.add(1, "周树人");
        System.out.println(list);

    }
}
