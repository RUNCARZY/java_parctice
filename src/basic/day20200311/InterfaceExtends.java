package basic.day20200311;
/*
接口之间允许多继承
抽象方法重复，无需进行处理
重复的默认方法，必须覆盖重写
 */
public interface InterfaceExtends extends MyInterfaceA, MyInterfaceB {
    public default void methodDefault(){
        System.out.println("多继承接口，重写重复的默认方法");
    }
}
