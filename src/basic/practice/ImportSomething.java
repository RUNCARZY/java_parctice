package basic.practice;
import basic.practice.Human;


public class ImportSomething {
    public static void main(String[] args) {
        Human man = new Human();
        man.sayHi();
        Woman woman = new Woman();
        woman.haHa();
    }
}

class Woman{
    private int age;
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
    public void haHa(){
        System.out.println("haha!~");
    }
}
