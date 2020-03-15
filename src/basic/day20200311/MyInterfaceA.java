package basic.day20200311;

public interface MyInterfaceA {
    public abstract void method();
    public default void methodDefault(){
        System.out.println("这是接口A中的默认方法");
    }
}
