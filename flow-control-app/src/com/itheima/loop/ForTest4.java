package com.itheima.loop;

public class ForTest4 {
    public static void main(String[] args) {
        // 需求：找出水仙花数并输出

        // 定义变量记录水仙花数的个数
        int count = 0;
        // 1.定义一个for循环找出三位数
        for (int i = 100; i <= 999; i++) {
            // 2.判断是否满足这个要求 例如342
            // 个位 除十取余
            int ge = i % 10;
            // 十位 除十取整，再除十取余
            int shi = i / 10 % 10;
            // 百位 除百取整
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                System.out.print(i + "\t");
                count ++;
            }

        }
        System.out.println(); // 换行
        System.out.println("三位数的水仙花数的个数为：" + count);
    }
}
