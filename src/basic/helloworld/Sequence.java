package basic.helloworld;

public class Sequence {
    public static void main(String[] args) {
//        int x = 5;
//        if (1<x && x<6){
//            System.out.println(x);
//        } else {
//            System.out.println(0);
//        }
        int x = 3;
        switch(x){
            case 1:
                System.out.println(1);
                break;
            case 3:
                System.out.println(3);
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("不是135");
        }
    }
}
