package basic.day20200311;

public interface MyInterfaceB {
    public abstract void method();
    public default void methodDefault(){
        System.out.println("这是接口B中的默认方法");
    }
}
