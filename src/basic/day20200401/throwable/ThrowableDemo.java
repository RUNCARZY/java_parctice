package basic.day20200401.throwable;
/*
java.lang.Throwable是java中所有错误和异常的超类，有两个直接子类：Error、Exception

java.lang.Error：无法catch，程序无法继续运行下去

java.lang.Exception:    可以被捕获并处理
      编译期异常，要求在编译时就必须意识到（有可能）会产生该异常，必须对该异常进行处理
    RuntimeException：运行期异常，不强制要求在编译期就catch或throws

抛出异常：
throw关键字：在方法内部抛出指定的异常-throw new xxxException();
throws关键字：方法抛出异常，方法调用者对其进行处理：
修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException...{}

异常处理方式：
方法一：try...catch进行捕获，异常被catch后不会继续执行下面的catch语句，因此子类异常要放在上面。
try {...}
catch (Exception1 e) {...}
catch (Exception2 e) {...}
finally {...}
注意：finally语句块中的return值会覆盖try语句块中的return值

捕获异常后的常见处理：
获取、记录异常信息
继续抛出异常

方法二：throws抛给调用者处理
=============================================
Throwable中定义了3个处理异常的方法：
String getMessage(): 返回异常简要信息
String toString(): 返回异常详细信息
void printStackTrace(): JVM默认调用，打印的异常信息最详细
====================================================
多异常处理：
1、分别捕获，分别处理
2、一次捕获，多次处理
3、一次捕获，一次处理
===============================================================
子类重写父类方法，子类抛出异常范围 <= 父类抛出异常范围（良好的封装性）


=============================================================
自定义异常：
1、继承Exception或者RuntimeException
2、一般需要重写构造方法，无参及有参

 */
public class ThrowableDemo {
}
