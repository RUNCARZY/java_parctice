package basic.day191211;
// 匿名对象只能使用一次，可作为方法的参数或者返回值

public class Anonymous {
    public static void main(String[] args) {
        // 直接用只能使用一次
        new Person().sayHi();

        // 匿名参数作为方法参数
        setAndSayName(new Person());
    }
    public static void setAndSayName(Person person){
        person.name = "chuizi";
        person.sayHi();
    }
}
