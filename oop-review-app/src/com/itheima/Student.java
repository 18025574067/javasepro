package com.itheima;

public class Student {
    private String name;
    private int age;
    private char gender;

    public Student() {
        System.out.println("无参数构造器执行：");
    }

    public Student(String name, int age, char gender) {
        System.out.println("有参数构造器执行：");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
