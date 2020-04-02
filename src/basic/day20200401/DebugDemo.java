package basic.day20200401;
/*
    Debug：打断点、逐行调试
 */
public class DebugDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        Zi zi1 = new Zi("asd", 21);
        Fu fu1 = new Zi("die", 22);
        fu1.sayName();
    }

}

class Fu {
    public String name;
    public int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayName() {
        System.out.println(this.name);
    }
}

class Zi extends Fu {
    public Zi() {
    }

    public Zi(String name, int age) {
        super(name, age);
        this.sayHi();
    }

    public void sayHi() {
//        System.out.println("Hi!");
    }
    @Override
    public void sayName(){
        System.out.println(this.name);
        sayAge();
    }

    public void sayAge(){
        System.out.println(this.age);
    }
}