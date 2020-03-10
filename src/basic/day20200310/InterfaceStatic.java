package basic.day20200310;
/*
从java8开始，接口中允许定义静态方法
public static 返回类型 方法名(参数列表) {方法体}
通过 接口.方法名 进行调用。
不能通过实现类或实现类对象调用接口静态方法

接口中可以定义常量，用public static final进行声明，建议用全大写+下划线进行命名
final关键字：指向的对象引用不可变
 */
public interface InterfaceStatic {
    public static final String NAME = "o"; // 定义了一个特殊的成员变量--常量，public static final三个关键字可以被省略
    public static void methodStatic() {
        System.out.println("This is a static method.");
    }
}
