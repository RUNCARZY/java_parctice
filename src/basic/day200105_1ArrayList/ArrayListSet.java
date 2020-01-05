package basic.day200105_1ArrayList;

import java.util.ArrayList;

/*
ArrayList集合的特点是长度可以变化的有序集合；
ArrayList后的<E>表示泛型，指明其中元素的类型，该类型只能是引用类型，不能是基本类型；
从jdk1.7开始，泛型可以省略不写，但要保留尖括号<>；
打印Array List得到的不是地址，而是内容；
*/

/*
ArrayList常用方法：
public boolean add(E e):向集合当中添加一个E类型的对象
public E get(int index):通过索引访问元素
Public E remove(int index):通过索引删除元素，返回被删除的元素
public int size():获取集合长度
* */
public class ArrayListSet {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("xiaobai", 2));
        people.add(new Person("xiaohei", 23));
        System.out.println(people);
        System.out.println(people.get(0));
        System.out.println(people.size());
        System.out.println(people.remove(0).getName());// 把0上的元素移除，其他元素索引往前挪
        System.out.println(people.get(0).getName());
    }
}
