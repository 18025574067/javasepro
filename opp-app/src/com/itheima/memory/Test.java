package com.itheima.memory;

/**
    目标：理解2个变量指向同一个对象的内存运行机制
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉，游戏，学习";
        s1.study();

        // 把变量s1赋值给s2
        Student s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

        s2.hobby = "爱提问";

        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s1.hobby);
        s2.study();

    }
}
