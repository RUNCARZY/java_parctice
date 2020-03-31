package basic.day20200331;
/*
java.util.List特点：
1、有序的集合
2、有索引
3、允许存储重复的元素

常用方法:
void add(int index, E element)：指定位置插入
E get(int index)：获取元素
E remove(int index)：移除元素，并返回被移除的元素
set(index)：设置元素


实现类ArrayList：
1、增删在底层实现要进行数组复制，效率低。
2、索引访问查询快。
3、非同步，线程不安全

实现类LinkedList：
1、双链表，兼具堆栈、队列的功能
2、查询慢，增删快
3、有许多直接操作两头的方法
4、同时也实现了Deque接口


addFirst(E e)----push()
addLast(E e)
get(int index)
返回此列表中指定位置的元素。
getFirst()
返回此列表中的第一个元素。
getLast()
remove(int index)
remove(Object o)

removeFirst()--pop()
removeLast()



实现类Vector：jdk1.2后较少使用，

 */
public class LIstDemo {
}
