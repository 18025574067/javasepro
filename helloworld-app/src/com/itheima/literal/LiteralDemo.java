package com.iteima.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 目标：需要同学们掌握常见数据在程序中的书写格式吧！
        // 1. 整数
        System.out.println(666);

        // 2. 小数
        System.out.println(55.9);

        // 3. 字符：必须用单引号围起来，有且只能是一个字符
        System.out.println('a');
        System.out.println('小');
        System.out.println('0');
//        System.out.println('中国');
        System.out.println(' '); // 空字符
//        System.out.println('');
        // 特殊字符，\n 代表的是换行符，\t 代表的是一个tab键
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        // 4.字符串，必须用双引号围起来，里面的内容可以随意
        System.out.println("我爱你中国abc");
        System.out.println("    ");
        System.out.println("中");

        // 5.布尔值，只有两个值：ture false
        System.out.println(true);
        System.out.println(false);


    }
}
