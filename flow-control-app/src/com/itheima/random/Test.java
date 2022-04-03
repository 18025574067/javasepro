package com.itheima.random;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        // 20-40
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int date = r.nextInt(20, 41);
            System.out.println(date);
        }

    }
}
