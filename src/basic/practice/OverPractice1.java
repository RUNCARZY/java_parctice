package basic.practice;

public class OverPractice1 {
    public static void main(String[] args){
        System.out.println(equal(1, 'a'));
        System.out.println(equal('a', 'a'));
        System.out.println(equal('a', 12));
        System.out.println(equal(1.0, 22));
    }
    public static boolean equal(char a, char b) {
        System.out.println("char and char");
        return a == b;
    }
    public static boolean equal(int a, int b){
        System.out.println("int and int");
        return a == b;
    }
    public static boolean equal(double a, double b){
        System.out.println("double and double");
        return a == b;
    }


}
