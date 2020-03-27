package basic.day20200327.Reflection;
/*
   所有的class在JVM中都是Class的一个实例，通过Class实例获取类信息的方法称为“反射”
   获取信息的方法：
   1.通过一个class的静态变量class获取：
   Class cls = String.class;

   2.通过实例变量的getClass方法获取：
   String s = "hello";
   Class cls = s.getClass();

   3.如果知道一个类的完整类名，可以通过静态方法Class.forName()获取：
   Class cls = Class.forName("java.lang.String")

   由于Class实例在JVM中是唯一的，上述三种方法回去的对象是同一个。

   动态加载：JVM在运行时，第一次运行到需要某个类的时候才将对应的类加载进内存（比如未执行的if语句中对应的类不会被预先加载）
 */

/*
# 读取字段方法
Field getField(name)：根据字段名获取某个public的field（包括父类）
Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
Field[] getFields()：获取所有public的field（包括父类）
Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）



 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException{
        Test test = new Test("xiaoming", 12);
        Class cls = test.getClass();
        Field f = cls.getField("name");
        System.out.println(f.getName());
        System.out.println(f.getType());
        int m = f.getModifiers();
        System.out.println(Modifier.isFinal(m)); // true
        Modifier.isPublic(m); // false
        Modifier.isProtected(m); // false
        Modifier.isPrivate(m); // true
        Modifier.isStatic(m); // false
    }
}

class Test {
    public String name;
    public int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
