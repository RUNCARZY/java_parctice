package basic.day20200318_2;
/*
final用于修饰局部变量时：
1.如果变量是引用数据类型，那么引用不可变，引用对象的属性可变
2.如果变量是基本数据类型，那么基本数据不可变
 */
public class FinalLocalVar {
    public static void main(String[] args) {
        final int money = 100;
//        money = 10; // error
        final Student student = new Student("xiaoming");
        System.out.println(student);
        System.out.println(student.getName());
//        student = new Student("xiaobai"); //error
        student.setName("xiaohei");
        System.out.println(student);
        System.out.println(student.getName());

    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}

