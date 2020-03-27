package basic.day20200327;

import java.util.ArrayList;

/*
增强for循环，也叫foreach。
底层使用的也是迭代器，简化了迭代器的遍历。jdk1.5后的新特性
public interface Iterable<T>，实现这个接口允许对象成为"foreach"语句的目标
格式：
    for (集合/数组中数据的类型 变量名：集合名 数组名){
    }
 */
public class StrongerForCircle {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("haha");
        c.add("hehe");
        for (String item:c){
            System.out.println(item);
        }
    }
}
