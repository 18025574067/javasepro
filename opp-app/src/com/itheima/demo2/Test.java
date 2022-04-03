package com.itheima.demo2;

/**
    目标：完成电影信息的展示案例，理解面向对象编程的代码

    "《长津湖》"， 9.7, "吴京"
    "《我和我的父辈》", 9.6, "吴京"
    "《扑水少年》", 9.5, "王川"
 */
public class Test {
    public static void main(String[] args) {
        // 1. 设计电影类

        // 2. 创建电影对象，封装电影的信息

        // 3. 定义3个电影类型的数组，存储3部电影对象
        Movie[] movies = new Movie[3];

        movies[0] =  new Movie("《长津湖》", 9.7, "吴京");
        movies[1] = new Movie("《我和我的父辈》", 9.6, "吴京");
        movies[2] = new Movie("《扑水少年》", 9.5, "王川");

        // 4. 遍历数组中的每个对象，输出电影信息
        for (Movie m : movies) {
            System.out.println(m);
            System.out.println("片名：" + m.getName());
            System.out.println("排名：" + m.getScore());
            System.out.println("主演：" + m.getActor());
            System.out.println("===============================");
        }

    }
}
