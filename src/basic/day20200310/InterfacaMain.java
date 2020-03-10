package basic.day20200310;

public class InterfacaMain {
    public static void main(String[] args) {
//        myInterfaceDefault implementA = new myInterfaceDefault(); // 错误，抽象方法未实现，不能用new接口创建对象
        myInterfaceDefault implementA = new Implement(); //可以使用接口声明，使用实现类new上一个对象
        Implement implementB = new Implement(); //可以使用实现类声明，使用实现类new上一个对象
        implementA.hi();
        implementA.smile(); // 默认方法被继承了下来

        InterfaceStaticImplement implementStatic = new InterfaceStaticImplement();
        InterfaceStatic.methodStatic(); // 可以通过接口直接调用接口静态方法
//        InterfaceStaticImplement.methodStatic(); // 不能通过实现类调用接口静态方法
//        implementStatic.methodStatic(); // 不能通过实现类对象调用接口静态方法

    }
}
