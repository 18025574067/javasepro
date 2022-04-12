package com.itheima;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
//        s.setAge(23);
//        s.setName("张三");
//        s.setGender('男');

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());

        Student s2 = new Student("李四", 24, '男');

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGender());
    }
}
