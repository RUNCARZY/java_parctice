package basic.day191211;
import java.util.Scanner;
public class InputIntAdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
    }
}
