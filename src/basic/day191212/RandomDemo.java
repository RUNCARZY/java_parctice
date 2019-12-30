package basic.day191212;
import java.util.Random;
import java.util.Scanner;
public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        // 生成int范围内的随机数（包括正负）
        System.out.println(rd.nextInt());

        // 生成特定整数范围[0,n)内的随机数
        System.out.println(rd.nextInt(110));

        // 运行小游戏
        new GuessNum(100).run();
    }
}

// 猜数字小游戏
class GuessNum{
    private int goal;
    private boolean result = false;

    public GuessNum(){
        this.goal = new Random().nextInt(1000);
    }
    public GuessNum(int num){
        if(num>0) {
            this.goal = new Random().nextInt(num);
        }else{
            this.goal = new Random().nextInt(1000);
        }
    }

    private void guessWhat(int num){
        if(this.goal==num){
            this.result = true;
            System.out.println("You are right!");
        }else if(this.goal<num){
            System.out.println("It's too big.");
        }else{
            System.out.println("It's a dick.");
        }
    }
    public boolean run(){
        Scanner sc = new Scanner(System.in);
        int tryTry;
        while(!this.result){
            System.out.println("Have a try!");
            tryTry = sc.nextInt();
            this.guessWhat(tryTry);
        }
        return true;
    }
}
