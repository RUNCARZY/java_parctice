package basic.day20200311;
/*
1. 类与类之间是单继承
2. 类与接口之间是多实现的
3. 接口与接口之间是多继承的
 */
public class Main {
    public static void main(String[] args) {
        Impl impl = new Impl2();
        impl.methodDefault();
    }
}
