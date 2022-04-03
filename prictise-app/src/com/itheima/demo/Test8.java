package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * 目标：模拟双色球
 */

public class Test8 {
    public static void main(String[] args) {
        // 1. 随机6个红球号码（1-33，不能重复），随机一个蓝球号码（1-16），可以采用数组装起来作为中奖号码。
        int[] luckNumbers = createLuckNumber();
//        printArray(luckNumbers);
        // 2. 调用一个方法让用户输入7个号码，作为用户选号
        int[] userNumbers = userInputNumbers();
//        printArray(userNumbers);
        // 3. 判断中奖情况
        judge(luckNumbers, userNumbers);
    }

    public static void judge(int[] luckNumbers, int[] userNumbers) {
        // 判断是否中奖了
        // luckNumber = {11, 22, 12, 23, 5, 18, 9}
        // userNumber = {22, 23, 15, 26, 7, 10, 8}
        // 1. 定义两个变量分别存储蓝球，红球命中的个数
        int redHitNumber = 0;
        int blueHitNumber = 0;

        // 2. 判断红球命中了几个，开始统计
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if (userNumbers[i] == luckNumbers[j]) {
                    redHitNumber++;
                    break;
                }
            }
        }
        // 3. 蓝球是否命中？
        blueHitNumber = luckNumbers[6] == userNumbers[6] ? 1 : 0;

        // 4.判断中奖情况了
        System.out.println("开奖结果是：");
        printArray(luckNumbers);
        System.out.println("您投注号码是：");
        printArray(userNumbers);
        System.out.println("命中红球个数：" + redHitNumber);
        System.out.println("命中蓝球：" + (blueHitNumber == 1 ? "是" : "否"));

        if (blueHitNumber == 1 && redHitNumber < 3) {
            System.out.println("恭喜你, 中了5元小奖！");
        } else if (blueHitNumber == 1 && redHitNumber == 3 || blueHitNumber == 0 && redHitNumber == 4) {
            System.out.println("恭喜你, 中了10元小奖！");
        } else if (blueHitNumber == 1 && redHitNumber == 4 || blueHitNumber == 0 && redHitNumber == 5) {
            System.out.println("恭喜你, 中了200元！");
        } else if (blueHitNumber == 1 && redHitNumber == 5) {
            System.out.println("恭喜你, 中了3000元大奖！");
        } else if (blueHitNumber == 0 && redHitNumber == 6) {
            System.out.println("恭喜你，中了500万元超级大奖！");
        } else if (blueHitNumber == 1 && redHitNumber == 6) {
            System.out.println("恭喜你，中了1000万元巨奖！");
        } else {
            System.out.println("感谢您为福利事业作出的突出贡献！！");
        }
    }

    public static int[] userInputNumbers() {
        // a. 定义一个数组存储7个号码
        int[] numbers = new int[7];
        // b. 让用户录入6个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请您输入第" + (i + 1) + "个红球号码（1-33不重复）：");
            int data = sc.nextInt();
            // c. 把当前录入的数据存入到数组中去
            numbers[i] = data;
        }
        // d. 单独录入一个蓝球号码
        System.out.println("请您输入蓝球号码（1-16）：");
        numbers[6] = sc.nextInt();
        return numbers;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println();
    }

    public static int[] createLuckNumber() {
        // a. 定义一个动态初始化的数组，存储7个数字
        int[] numbers = new int[7];
        // b. 遍历数组，为每个位置生成对应的号码(遍历前6个数字，生成不重复的6个红球，范围是1-33)
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            // 为当前位置找出一个不重复的1-33之间的数字
            while (true) {
                int data = r.nextInt(33) + 1; // 1-33
                // c. 注意：必须判断当前随机的这个号码之前是否出现过，出现过要重新随机一个，直到不重复为止，才可以存入数组中去。
                // 定义一个标记位flag, 默认data是没有重复的
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data) {
                        // data这个数据出现过，不能用
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    // data这个数据没有出现过，可以使用
                    numbers[i] = data;
                    break;
                }
            }
        }
        // d. 为第7个位置生成一个1-16的蓝球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }
}