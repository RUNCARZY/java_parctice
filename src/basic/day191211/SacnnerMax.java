package basic.day191211;
import java.util.Scanner;

public class SacnnerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数字");
        int num3 = scanner.nextInt();
        int[] array = {num1, num2, num3};
        System.out.println("最大值是"+maxNum(array));
    }

    private static int maxNum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) max = array[i];
        }
        return max;
    }
}
