package basic.day20200420.CommonFuncApi;
/*
    在java.util.function包下有许多函数式接口

    Supplier<T> 接口被称为生产型接口，重写接口的T get()方法，返回一个泛型对象
    Consumer<T> 接口是一个消费型接口，重写接口的void accept(T t)方法，消费对象
        Consumer接口中有个默认方法andThen，可以连接两个Consumer再进行消费，con1.andThen(con2).accept(t)
        default Consumer<T> andThen(Consumer<? super T> after)  返回一个组合的 Consumer ，按顺序执行该操作，然后执行 after操作。

    Predicate<T> 接口对某种数据类型的数据进行判断，返回一个boolean值，重写boolean test(T t)
        默认方法：
        default Predicate<T> and(Predicate<? super T> other) 返回两个断言进行与逻辑后的断言
        default Predicate<T> or(Predicate<? super T> other) 或
        default Predicate<T> negate() 非

    Function<T, R> 接口根据一个类型的数据得到另外一个类型的数据，前者称为前置条件，后者称为后置条件
        重写R apply(T t)方法进行数据转换
        默认方法：
        default <V> Function<T,V> andThen(Function<? super R,? extends V> after) 把类型T->R->V


 */
public class APIs {
}
