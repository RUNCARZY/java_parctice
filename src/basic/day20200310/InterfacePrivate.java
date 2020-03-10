package basic.day20200310;
/*
接口的私有方法，可以被接口中的默认方法/静态方法进行调用，解决代码重复性问题
从java 9 开始，类中允许定义私有方法
1. 普通私有方法：可以被接口默认方法调用
private 返回值类型 方法名(参数列表) {方法体}
2. 静态私有方法：可以被接口静态方法调用
private static 返回值类型 方法名(参数列表) {方法体}
 */
public interface InterfacePrivate {
    public default void sayName() {
//        sayHi();
        System.out.println("");
    }
    public default void sayAge() {
//        sayHi();
        System.out.println();
    }

    /* //Java 8 中不允许
    private void sayHi() {
        System.out.println("Hi");
    }

     */
}
