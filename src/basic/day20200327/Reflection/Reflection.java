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
set(Object，Object)：可以修改字段值(包括private)，第一个Object是要修改字段的实例，第二个Object是待修改的值

# 读取方法的方法
Method getMethod(name, Class...)：获取某个public的Method（包括父类）
Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
Method[] getMethods()：获取所有public的Method（包括父类）
Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）

invoke(object, param)：Method对象的方法，使用该方法调用对象的方法，调用静态方法时第一个参数为null
为了调用非public方法，我们通过Method.setAccessible(true)允许其调用

# 调用构造方法
class.newInstance(): 无参构造方法
getConstructor(Class...)：获取某个public的Constructor；
getDeclaredConstructor(Class...)：获取某个Constructor；
getConstructors()：获取所有public的Constructor；
getDeclaredConstructors()：获取所有Constructor。

# 获取父类
Class getSuperClass()

# 获取接口
Class[] getInterfaces() // 不包括父类实现的接口类型

动态代理Dynamic Proxy：可以在运行期间直接创建接口实例

 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

        //
//        Field[] fields = cls.getFields();
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        Method[] methods = cls.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

    }
}

class Test {
    public String name;
    public int age;
    private int death;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void die(int year) {
        this.death = year;
    }

    private int getDeath() {
        return this.death;
    }

}
