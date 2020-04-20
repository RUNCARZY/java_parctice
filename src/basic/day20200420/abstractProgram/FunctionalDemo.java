package basic.day20200420.abstractProgram;
/*
函数式接口，接口中只有唯一一个抽象方法的接口

注解：检测接口是不是函数式接口@FunctionalInterface
 */

@FunctionalInterface
public interface FunctionalDemo {
    void onlyMethod();
}
