package com.itheima.encapsulation;

public class Student {
    // 1、成员变量 使用private 修饰，只能在本类中访问了。
    private int age;

    /**
        2、提供成套的getter 和setter 方法暴露其取值和赋值
     */

    public void setAge(int age){
        if (age > 0 && age < 200) {
            this.age = age;
        }else {
            System.out.println("你的输入有误！");
        }
    }

    public int getAge(){
        return age;
    }
}
