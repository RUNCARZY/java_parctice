package basic.day200106;
/*
使用static来修饰成员，实现静态变量，静态方法（类似于python中的类成员，类方法）

类中使用static静态代码块，静态代码块会且只会在类第一次使用的时候执行一次,通常用来初始化静态变量
 */
public class StaticKeyWord {
    public static void main(String[] args) {
        SuperMan Li = new SuperMan("Li");
        SuperMan Yu = new SuperMan("Yu");
    }

}
class SuperMan{
    static String city;
    String name;
    static{
        city = "London";
        System.out.println("London Bridge falling down.");
    }

    public SuperMan() {
    }

    public SuperMan(String name) {
        this.name = name;
        System.out.println(this.name + "in" + city);
    }
}
