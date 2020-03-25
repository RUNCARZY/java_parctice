package basic.helloworld;

public class Circle {
    public static void main(String[] args) {
    // 用三种循环1到100的加法
        System.out.println("result for \"for\"" + add_for());
        System.out.println("result for \"while\"" + add_while());
        System.out.println("result for \"do-shile\"" + add_do_while());
    }

    public static int add_for() {
        int sum = 0;
        for (int i = 1; i<=100; i++){
            sum += i;
        }
        return sum;
    }
    public static int add_while(){
        int sum=0, i=1;
        while (i<=100){
            sum += i;
            i += 1;
        }
        return sum;
    }
    public static int add_do_while() {
        int sum = 0, i = 1;
        do {
            sum += i;
            i += 1;
        } while (i <= 100);
        return sum;
    }
}
