package com.itheima.create;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用静态初始化方法定义数组
        // 数据类型[] 数组名称 = new 数组类型[]{元素1，元素2，...};

//        double[] scores = new double[]{99.5, 84,0, 90.0};
        double[] scores = {99.5,84.0,90.0}; //简化写法

//        int[] ages = new int[]{18, 33, 45};
        int[] ages = {18, 33, 45};

//        String[] names = new String[]{"张三", "李四", "王伍"};
        String[] names = {"张三", "李四", "王伍"};

        System.out.println(scores);
        System.out.println(ages);
        System.out.println(scores.length);
        scores[2]= 22;
        System.out.println(scores[2]);
    }
}
