package basic.day20200310Interface;

public class ImplementB implements myInterfaceDefault{
    @Override
    public void hi() {
        System.out.println("Hi!");
    }

    // 默认方法可以被覆盖重写
    @Override
    public void smile() {
        System.out.println("Hahahahaha...");
    }
}
