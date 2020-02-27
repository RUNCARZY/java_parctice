package basic.day20200210;
/*
子类继承时访问成员变量的两种情况：
1、直接访问成员变量（通过 对象.变量 访问）：
    优先在子类中查找该变量，如果没有，则向上寻找

2、间接访问成员变量（通过成员方法访问）：
    优先在该成员方法对应的级别中查找，如果没有，则寻找向上
 */
public class ExtendsField {
    public static void main(String[] args) {
        Parent fu = new Parent();
        Child kid = new Child();
        System.out.println(kid.num);
        System.out.println(kid.getNum());
        System.out.println(kid.numParent);
    }
}
