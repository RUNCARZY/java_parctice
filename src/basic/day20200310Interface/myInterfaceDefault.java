package basic.day20200310Interface;
/*
从JDK8开始，接口中可以定义默认方法：
public default 返回值类型 方法名(参数列表){方法体}

默认方法为了接口升级而设计的，当给接口新增功能时，不用到每个实现类中去修改。
默认方法会被实现类所继承.
默认方法可以被重载。
默认方法可以用来拼接函数模型。

接口不能有静态代码块、构造方法
 */
public interface myInterfaceDefault {
    public static int age = 10086; // 接口中可以定义静态变量
    public abstract void hi(); // 接口中的抽象方法，public与abstract可以省略不写

    public default void smile(){ // 默认方法的public可以省略不写

    }
}


