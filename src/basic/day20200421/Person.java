package basic.day20200421;

import basic.helloworld.HelloWorld;

public class Person extends Human{
    public static String pb = "Public";
    private static String pr = "Private";

    public String name;
    private int age;
    public final String pf = "public and final";

    public Person() {
    }

    public static void hello() {
        System.out.println("HelloWorld");
    }

    private Person(String name, int age) {
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

    private void setAge(int age) {
        this.age = age;
    }
}
