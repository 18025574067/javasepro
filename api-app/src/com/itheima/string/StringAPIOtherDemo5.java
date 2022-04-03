package com.itheima.string;

public class StringAPIOtherDemo5 {
    public static void main(String[] args) {
        String name = "我爱你中国china";
        // 1、public int length(): 获取字符串的长度
        System.out.println(name.length());
        // 2、public char charAt(int index): 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);
        System.out.println("----------------遍历字符串的每个字符----------------");
        for (int i = 0; i < name.length(); i++) {
            char c1 = name.charAt(i);
            System.out.println(c1);
        }
        // 3、public char[] toCharArray(): 把字符串转换成字符数组
        System.out.println();
        char[] chars = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            char a = chars[i];
            System.out.println(a);
        }

        // 4、public String substring(int beginIndex, int endIndex): 截取字符，包前不包后的
        String names = "Java是最厉害的编程语言";
        String name1 = names.substring(0, 9);
        System.out.println(name1);
        String name2 = names.substring(4, 9);
        System.out.println(name2);

        // 5、public String substring(int beginIndex): 从当前索引一直截取到末尾
        String rs2 = names.substring(4);
        System.out.println(rs2);

        // 6、public String replace(CharSequence target, CharSequence replacement)字符串替换
        String name3 = "金三胖是最厉害的80后，金三胖棒棒的，我好爱金三胖";
        String rs3 = name3.replace("金三胖", "***");
        System.out.println(rs3);

        // 7、public boolean contains(CharSequece s)字符串查找
        System.out.println(name3.contains("金三胖"));
        System.out.println(name3.contains("金二胖"));

        // 8、public boolean startsWiths(String prefix)以什么开头
        System.out.println(name3.startsWith("金三胖"));

        // 9、public String[] split(String s): 按照某个内容把字符串分割成字符串数组返回。
        String name4 = "王宝强,吴亦凡,贾乃亮";
        String[] names1 = name4.split(",");
        for (int i = 0; i < names1.length; i++) {
            System.out.println("选择了：" + names1[i]);
        }













    }
}
