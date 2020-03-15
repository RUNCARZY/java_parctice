package basic.day200105_2String;
/*
1、== 是进行对象的地址值比较，可以使用equals方法对内容进行比较
2、equals方法具有对称性,a.equals(b)恒等于b.equals(a)
3、常量跟变量比较时，推荐使用常量.equals(变量)，可以避免null.equals()空指针异常
4、忽略大小写比较使用方法equalsIgnoreCase()
 */
public class StringCompare {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String(new char[]{'a', 'b', 'c'});
        String str3 = "ABC";
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
    }
}
