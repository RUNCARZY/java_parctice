package basic.day20200421;
/*
注解作用：
1.编译检查
2.生成javadoc文档
3.代码分析

JDK预定义的一些注解
@Override : 检测该注解的方法是否继承父类或接口
@Deprecated : 该注解标示的内容，表示已过时
@SuppressWarning : 压制警告，一般传递参数 "all"

元注解：
@Target：描述注解能够作用的位置
    取枚举类ElementType中的值--TYPE类，METHOD方法，FIELD成员变量。可以取多个值
@Retention：描述注解被保留的阶段
    取枚举类RetentionPolicy中的值--SOURCE源码期, CLASS类加载期, RUNTIME运行期
@Documented：描述注解是否被抽取到javadoc文档中
@Inherited：描述父类的注解是否会被子类继承

自定义注解：
格式--
    元注解
    public @interface 注解名{}
本质上是一个接口，相当于 public interface 注解名 extends java.lang.annotation.Annotation {}
属性：接口中的抽象方法
    要求：
        A. 属性的返回值类型只能是以下几种
            1. 基本数据类型
            2. String
            3. 枚举
            4. 注解
            5. 以上类型的数组
        B. 属性在使用时需要赋值，可以使用default关键字设置默认值

使用（解析）注解
1. 获取注解定义的位置的对象
2. 获取指定的注解
3. 调用注解中的抽象方法来获取属性值

注解由编译器，或者注解解析程序使用

 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnno {
    int max();
    int min() default 0;
}
