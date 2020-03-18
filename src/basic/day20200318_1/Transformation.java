package basic.day20200318_1;
/*
向上转型既多态，向上转型一定是安全的
向下转型，可以用于在多态中访问子类的特有方法
如果对象不属于子类，则会出错。用instanceof关键字进行安全向下转型判断
向下转型类似于强制类型转换
语法：
子类 变量名 = (子类)被父类引用的子类对象

 */
public class Transformation {
    public static void main(String[] args) {
        Animal cat1 = new Cat(); // 向上转型，即多态
        cat1.eat();
        Cat cat2 = new Cat();
        Animal cat3 = cat2; //向上转型，父类引用指向子类对象
        cat2.eat();
        cat3.eat();

        // 向上转型后，可以向下转型还原回来
        Cat cat4 = (Cat)cat3;
//        Dog dog = (Dog)cat3; // 编译可以通过，运行报错ClassCastException。不能强行向下转型
        // 以下全部为true
        System.out.println(cat1 instanceof Cat);
        System.out.println(cat1 instanceof Animal);
        System.out.println(cat2 instanceof Cat);
        System.out.println(cat2 instanceof Animal);
        System.out.println(cat3 instanceof Cat);
        System.out.println(cat3 instanceof Animal);
        System.out.println(cat4 instanceof Cat);
        System.out.println(cat4 instanceof Animal);
    }
}
