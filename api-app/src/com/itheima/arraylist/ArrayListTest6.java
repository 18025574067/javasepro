package com.itheima.arraylist;

import java.util.ArrayList;

/**
    案例：学生信息系统：展示数据，并按照学号完成搜索
    学生类信息（学号，姓名，性别，班级）
    测试数据：
    "20180302", "叶孤城", 23, "护理一班"
    "20180303", "东方不败", 23, "推拿二班"
    "20180304", "西门吹雪", 26, "中药学四班"
    "20180305", "梅超风", 26, "神经科2班"

 */
public class ArrayListTest6 {
    public static void main(String[] args) {
        // 1. 定义学生类

        // 2. 创建集合存储学生对象，创建学生对象存储学生信息
        // 把学生对象添加到集合
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180303", "东方不败", 23, "推拿二班"));
        students.add(new Student("20180304", "西门吹雪", 26, "中药学四班"));
        students.add(new Student("20180305", "梅超风", 26, "神经科2班"));

        // 3. 遍历集合展示学生信息
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("学号：" + s.getStudyNumber());
            System.out.println("姓名：" + s.getName());
            System.out.println("年龄：" + s.getAge());
            System.out.println("班级：" + s.getClassNumber());
            System.out.println("=========================");
        }
    }
}
