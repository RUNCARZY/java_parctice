package basic.day20200311;
/*
接口多实现：
多接口中的，抽象方法重复，重写一个即可
默认方法重复，必须覆盖重写
继承父类优先于实现接口，如果父类中的方法与接口中的默认方法重复，以父类的为准
 */
public class Impl extends Object implements MyInterfaceA, MyInterfaceB{
    @Override
    public void method() {
        System.out.println("两个接口中重复的");
    }

    @Override
    public void methodDefault() {
        System.out.println("对冲突的默认方法进行覆盖重写");
    }
}
