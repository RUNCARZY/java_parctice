package basic.day20200420.abstractProgram;
/*
方法引用是对lambda表达式的一种更省略的写法，如果Lambda中的实现方法已经存在，则可以用已存在的对象对方法进行使用
比如：
(String str) -> System.out.println(str)

等价于：
System.out::println

使用方式：
1. 通过已经存在的对象引用成员方法
2. 通过类引用静态方法
3. 通过super引用父类方法
4. 通过this引用本类成员方法
5. 通过 类名::new 来引用构造方法
6. 通过 类名[]::new 来引用数组构造方法
 */
public class FuncReference {
}
