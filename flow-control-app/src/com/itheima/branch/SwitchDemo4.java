package com.itheima.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        // 需求：用户输入月份可以展示该月份的天数
        // 1, 3, 5, 7, 8, 10, 12月份是31天
        // 2月份是闰年为29天，非闰年为28天
        // 4, 6, 9, 11月份是30天
        int month = 4;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月份是31天");
                break;
            case 2:
                System.out.println(month + "月份是闰年为29天，非闰年为28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月份是30天");
                break;
            default:
                System.out.println("输入有误!");
        }
    }
}
