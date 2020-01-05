package basic.day200105_1ArrayList;
/*
定义一个标准类：
所有成员变量都是私有的；
所有成员变量都有对应的get和set方法；
有无参构造方法、全参构造方法；
 */
public class StandardClassStudent {
    private String name;
    private int age;

    public StandardClassStudent() {
    }

    public StandardClassStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
