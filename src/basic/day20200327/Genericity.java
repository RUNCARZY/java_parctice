package basic.day20200327;

/*
泛型可以看成是变量，把类作为参数，用来接收数据类型。
创建集合对象时不写泛型，默认为Object，可以添加任意类型的数据，但容易引发异常

创建对象时使用泛型，避免了转型的麻烦。
可以把运行期的异常，提升到编译期（相对于使用Object泛型）

定义方法时使用泛型，在调用时传入什么类型的对象，其泛型就是对象的类型

可以使用任意字母
E e: Element
T t: Type
M m: Method

含泛型的接口两种使用方式：
1：在实现类指定接口的类型
2. 在实现类沿用接口的泛型

泛型通配符：? 只能用于方法形参类型

泛型限定：
泛型上限限定： ? extend E 使用的类型必须是E及其子类
泛型下限限定： ? super E 使用的类型必须是E及其父类


 */
public class Genericity {
}

interface GenericInterface<T> {
    void say(T t);
}

// 实现类指定特定类型
class GenericImpl1 implements GenericInterface<String> {
    @Override
    public void say(String s) {
        System.out.println(s);
    }
}

// 在实现类沿用泛型
class GenericImpl2<E> implements GenericInterface<E> {
    @Override
    public void say(E e) {
        System.out.println(e);
    }
}

// 定义含泛型的类，方法
class GeneraticClassAndMethod<E> {
    public E ee;
    public E say1(E e) {
        System.out.println(e);
        return e;
    }

    // 在调用时传入什么参数类型，泛型就是什么参数类型
    public <M> void say2(M m){
        System.out.println(m);

    }
    public <M> E say3(M m){
        System.out.println(m);
        return this.ee;
    }

}