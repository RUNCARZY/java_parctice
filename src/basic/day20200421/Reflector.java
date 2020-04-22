package basic.day20200421;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    "反射是框架设计的灵魂"
反射：将类的信息封装称为对象的机制

获取反射对象的方式：
1. Class.forName("全类名")， 将字节码加载进内存，返回Class对象
2. 类名.class 通过类属性
3. 对象.getClass 通过Object类的方法
三种方式获取的Class对象都是同一个。

可以通过Class对象获取成员方法、构造方法、成员变量、类名、父类信息等

获取成员变量（包括父类）
Field[] getFields() 获取所有public成员变量
Field getField(String name)
Field[] getDeclaredFields() 在本类声明的所有成员变量
Field getDeclaredField(String name)


获取构造方法(父类的构造方法不会通过这些方法取得)
Constructor<?>[] getConstructors()  获取public构造方法
Constructor<T> getConstructor(Class<?>... parameterTypes)
Constructor<?>[] getDeclaredConstructors()  获取所有构造方法
Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
Constructor<?> getEnclosingConstructor()


获取成员方法（包括静态）
Method getMethod(String name, 类<?>... parameterTypes) 获取public的成员方法,包括父类
Method[] getMethods()
Method getDeclaredMethod(String name, Class<?>... parameterTypes) 获取所有成员方法，不包括父类
Method[] getDeclaredMethods()
Method getEnclosingMethod()


Field方法：
1、get 设置值
2、set 获取值
3、setAccessible(true) 打开私有变量访问权限，称为暴力反射

Construct方法
<T> newInstance() 创建对象
也可以调用Class类的成员方法newInstance调用空参构造方法

Method方法：
invoke：执行方法
getName:  获取方法名
 */
public class Reflector {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("basic.day20200421.Person");
        Class cls2 = Person.class;
        Class cls3 = new Person().getClass();
        System.out.println((cls1 == cls2) && (cls1 == cls3)); // 相同

        Field[] fields = cls1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("------------");
        Field[] cls1Fields = cls1.getDeclaredFields();
        for (Field field : cls1Fields) {
            System.out.println(field);
        }
        System.out.println("===========================");
        Method[] methods1 = cls1.getDeclaredMethods();
        Method[] methods2 = cls2.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        System.out.println("----------------------");
        for (Method method : methods2) {
            System.out.println(method);
        }
        System.out.println("============================");
        Constructor[] constructors = cls1.getConstructors();
        Constructor[] declaredConstructors = cls1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----------------");
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }

    }
}
