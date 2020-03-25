package basic.day20200321;

/*
类A中有一个成员变量为类B对象
类B中有一个成员变量为类A对象
创建一个A类对象的时候 -> 会创建一个B类对象 -> 再创建一个A类对象 -> ...
造成堆溢出：java.lang.StackOverflowError
 */
public class Main {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        System.out.println(objA.b.a.b);
    }
}
