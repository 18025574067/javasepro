package com.iteima.variable;

public class VarialbeDemo3 {
    public static void main(String[] args) {
        // 目标：掌握使用基本数据类型定义不同的变量
        // 1.字节型 byte 占1个字节  -128～127

        byte number = 98;
        System.out.println(number);
//        byte number2 = 128; //报错

        // 2.短整形 short 占2个字节
        short money = 30000;
        System.out.println(money);

        // 3. int 整型 默认的类型  占4个字节
        int it = 424253424;
        System.out.println(it);

        // 4.long 长整形 占8个字节
        long lg = 123456789;
        // 注意：随便写一个字面量默认是int类型的，123456789012345虽然没有超过long表示的长度，但是它本身超过int类型的表示范围。
        // 如果希望写一个整数字面量当成long类型，需要在后面加l/L。
        long lg2 = 123456789012345L;

        // 5.浮点型（小数） float 单精度 占4个字节
        // 注意：如果随便写小数字面量默认是double类型，如果希望随便写一个小数字面量是float类型需要在后加f / F。
        float score = 99.9F;

        // 6.double双精度，占8个字节
        double score2 = 999.99;

        // 7. char字符 占8个字节
        char ch = 'a';
        char ch2 = '中';
//        char ch3 = '中国';  // 报错

        // 8.boolean 布尔类型 占1个字节
        boolean rs = true;
        boolean rs2 = false;

        System.out.println("-----------------引用数据类型-------------------");
        String name = "西门吹雪";
        System.out.println(name);

    }
}
