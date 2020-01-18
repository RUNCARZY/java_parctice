package basic.day20200115;
/*
继承语法：
class 类名 extends 父类(){}
 */
public class ExtendsDemo {
    public static void main(String args[]){
        new Person("小明");
        new Student("小许", 100);
    }
}

class Person{
    private String name;

    Person(String name) {
        this.name = name;
        this.sayName();
    }

    private void sayName(){
        System.out.println("I'm am "+this.name);
    }
}

class Student extends Person{
    private int grade;

    Student(String name, int grade) {
        super(name);
        this.grade = grade;
        this.sayGrade();
    }

    private void sayGrade(){
        System.out.print("我的成绩是：");
        System.out.println(this.grade);
    }
}