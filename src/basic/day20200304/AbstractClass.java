package basic.day20200304;
/*
抽象类：没有给出具体的实现，不能直接被实例化的类，通过继承实现方法
1.子类覆盖重写抽象父类当中所有的抽象方法后，才能创建对象
2.子类没有覆盖重写抽象父类当中所有的抽象方法，那子类必须也是抽象类
3.抽象类可以有抽象方法
 */
public class AbstractClass {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 错误，抽象类不能被
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.eat();
        cat2.eat();
        System.out.println((cat1 instanceof Animal)); //always true
        System.out.println((cat1 instanceof Cat)); //always true
        System.out.println((cat2 instanceof Animal)); //always true
        System.out.println((cat2 instanceof Cat)); //always true

    }
}
abstract class Animal {
    abstract void eat(); // 定义了一个抽象方法

    // 抽象类中也可以定义普通成员方法
    public void sayHi() {
        System.out.println("Hi!");
    }
}
class Cat extends Animal {
     protected void eat() {
         System.out.println("It eats bones.");
     }

}