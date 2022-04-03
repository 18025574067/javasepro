package com.itheima.overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：理解方法重载的形式，并理解其调用流程，最后需要知道方法重载的好处。

        fire();

        fire("日本");

        fire(520,"美国");
    }
    public static void fire(){
        fire("米国");
//        System.out.println("默认发射一枚子弹给米国～～～");
    }

    public static void fire(String location){
        fire(1,location);
//        System.out.println("发射一枚子弹给" + location + "-> ->");
    }

    public static void fire(int number, String location){

        System.out.println("发射" + number + "枚子弹给" + location + "-> ->");
    }
}
