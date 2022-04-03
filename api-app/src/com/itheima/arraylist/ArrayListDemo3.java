package com.itheima.arraylist;

import java.util.ArrayList;

/**
    目标：掌握ArrayList集合的常用API
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Java");
        list1.add("MySQL");
        list1.add("MyBatis");
        list1.add("HTML");

        // 1. public E get(int index):获取某个索引位置处的元素值
        String e = list1.get(3);
        System.out.println(e);

        // 2. public int size(): 获取集合的大小（元素个数）
        int j = list1.size();
        System.out.println(j);
        // 3. 完成集合的遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // 4. public E remove(int index): 删除某个索引位置处的元素值，并返回被删除的元素值
        System.out.println(list1); // [Java, Java, MySQL, MyBatis, HTML]
        String e2 = list1.remove(2);
        System.out.println(e2);
        System.out.println(list1);

        // 5. public boolean remove(Object o): 直接删除元素值，删除成功返回true,删除失败返回false
        System.out.println(list1.remove("MySQL"));
        System.out.println(list1.remove("Java"));
        System.out.println(list1);

        // 如果有多个相同元素，只会删除第一个元素。
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("王富强");
        list.add("Java");
        list.add("MySQL");
        System.out.println(list.remove("Java1"));
        System.out.println(list);

        // 6. public E set(int index, E element): 修改某个索引位置处的元素值。
        String n = list.set(0, "林志玲"); // 返回被替换的元素值
        System.out.println(n);
        System.out.println(list);

    }
}
