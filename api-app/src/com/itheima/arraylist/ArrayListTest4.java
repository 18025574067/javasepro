package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        // 目标：学习遍历并删除元素的正确方案

        // 1. 创建一个ArrayList集合存储一个班级学生的成绩
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

        // 2. 把低于80分的成绩删除
        // 出BUG
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);
//            if(score < 80){
//                // 这个分数必须删除
//                scores.remove(i);
//                //[98, 66, 89, 50, 100]  出bug
//            }
//        }
//        System.out.println(scores);

         // 完美的解决方案之一：
/*        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if(score < 80){
                // 这个分数必须删除
                scores.remove(i);
                i--; // 删除成功后，必须退一步，这样可以保证可以回到这个位置，如此不会跳过数据。
            }
        }
        System.out.println(scores); */
        // [98, 77, 66, 89, 79, 50, 100]
        // 完美的解决方案之二：从后面遍历就可以
        for (int i = scores.size()-1; i >= 0; i--) {
            int score = scores.get(i);
            if (score < 80) {
                // 这个分数必须删除
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
