package com.itheima.loop;

public class ForForDemo9 {
    public static void main(String[] args) {
        // 目标：理解循环嵌套的执行流程
        // 假如你有老婆，你犯错了，老婆罚你说5天，每天3次 我爱你！
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++){
                System.out.println("我爱你！");
            }
            System.out.println("----------------------");
        }

        /**
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
