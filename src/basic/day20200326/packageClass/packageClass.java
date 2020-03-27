package basic.day20200326.packageClass;
/*
包装类：将基本数据类型包装类

装箱：把基本类型的数据包装到包装类中
1. 使用构造方法 (int value) (String s) 字符串s的内容必须是对应的基本数据类型
2. 静态方法valueOf(int value) (String s)
自动装箱-JDK1.5后的新特性：
Integer in = 1;



拆箱：int intValue();
自动拆箱：
Integer in = 1;
in = in + 2; // 自动拆箱后又自动装箱

基本类型与字符串的相互转换：
基本类型->字符串
1. 基本类型的值+字符串
2. 包装类的静态方法toString，不是Object类的toString，被重载了
3. String类的静态方法valueOf

字符串->基本类型：
使用包装类的静态方法parseXXX("字符串")

 */
public class packageClass {
    public static void main(String[] args) {
        int in1 = 100;
        System.out.println(in1 + "haha");
        String s1 = Integer.toString(in1);
        System.out.println(s1 instanceof String);
        String s2 = String.valueOf(in1);
        System.out.println(s2 instanceof String);

//        System.out.println(Integer.parseInt("11.2")); // java.lang.NumberFormatException: For input string: "11.2"
        System.out.println(Integer.parseInt("11"));
    }
}
