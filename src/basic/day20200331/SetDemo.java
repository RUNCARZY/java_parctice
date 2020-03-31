package basic.day20200331;

import java.util.HashSet;
import java.util.Set;

/*
    java.util.Set
特点：
1. 不允许存储重复的元素
2. 无索引


实现类java.util.HashSet:
特点：
1. 无序集合
2. 底层是一个哈希表结构，查询速度快
3. jdk1.8之前，哈希表=数据+链表， jdk1.8之后，哈希表=数组+链表/红黑树

哈希表，使用hashcode存储数据
如果一个hash对应多个对象，多个对象组织成一个链表。一个hashcode存储对象超过8个，链表对象会转换成红黑树。

LinkedHashSet：底层是一个哈希表+链表,保证元素有序


 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<Integer>();
    }
}
