package basic.day200105_2String;
/*
字符串常量池：使用双引号直接创建的字符串对象，就在字符串常量池中
从jdk1.7开始，字符串常量池放在堆当中
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String(new char[]{'a', 'b', 'c'});
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
    }
}
