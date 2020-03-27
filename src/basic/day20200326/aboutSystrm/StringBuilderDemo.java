package basic.day20200326.aboutSystrm;
/*
字符串String是用final byte[]实现的，不可变，进行操作占用空间多，效率低

使用字符串缓冲区StringBuilder可以节省内存空间，提高效率
其底层是一个没有被final修饰的数组，初始长度是16，超出长度会自动扩容

主要构造方法：
StringBuilder():构造一个没有字符的字符串构建器，初始容量为16个字符。
StringBuilder(String str):构造一个初始化为指定字符串内容的字符串构建器。

主要方法：
public StringBuilder append():可以传大部分数据类型，添加到原字符数组后，返回this，即StringBuilder对象本身
delete, insert, replace, substring, toString等

 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123abc");
        System.out.println(sb);
        sb.append("123ABC");
        System.out.println(sb);

        // append方法可以使用链式编程
        sb.append("as").append('d').append(new char[]{'1','g'});
    }
}
