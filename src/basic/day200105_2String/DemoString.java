package basic.day200105_2String;


/*
java.lang.String类
1、字符串是不可变的
2、字符串可以共享使用（相同的字符串使用相同的类型）
3、字符串效果上相当于char数组，但是底层原理是byte[]字节数组。

创建字符串的3+1种方式：
3种构造方法：
public String():创建空字符串
public String(char[] array):根据字符数组的内容，来创建对应的字符串
public String(byte[] array):根据字节数组的内容，来创建对应的字符串
1种直接创建：
用双引号""直接创建

 */
public class DemoString {
    public static void main(String[] args) {
        // 使用空参构造
        System.out.println(new String());

        // 使用字符数组构造
        System.out.println(new String(new char[]{'a', 'b'}));

        // 使用字节数组构造
        System.out.println(new String(new byte[]{36, 38, 55}));

        // 直接创建
        System.out.println("haha");

    }
}
