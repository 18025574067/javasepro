package com.itheima.arraylist;

import java.util.ArrayList;

/**
    案例：集合存储自定义元素并遍历。
    需求：定义电影类（名称，分值，演员），创建3个电影对象，代表三部影片，存入集合中并遍历
    "《肖生克的救赎》", 9.7, "罗宾斯"
    "《霸王别姬》", 9.6, "张国荣、张丰毅"
    "《阿甘正传》", 9.5, "汤姆.汉克斯"
 */
public class ArrayListTest5 {
    public static void main(String[] args) {
        // 目标：理解ArrayList集合存储自定义类型的变量。
        // 1. 定义电影类
        // 2. 创建三个电影对象
        Movie m1 = new Movie(  "《肖生克的救赎》", 9.7, "罗宾斯");
        Movie m2 = new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅");
        Movie m3 = new Movie(  "《阿甘正传》", 9.5, "汤姆.汉克斯");
        // 3. 创建一个电影类型的ArrayList集合，存放三部电影。
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);
    }
}
