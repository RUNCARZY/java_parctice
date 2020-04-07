package basic.day20200407.lambda;

/*
在使用函数式接口（只有一个抽象方法的接口）时，可以使用lambda函数式写法来实现，简化代码。
使用条件：接口只有一个抽象方法
使用原则：可推导则可省略。
基础语法：
(参数列表)->{方法体}

注意：
1.参数列表可以省略参数类型
2.方法体只有一句表达式时，可以省略return、{}和;
3.参数只有一个时，可以省略括号

 */
public class LambdaDemo {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("helloworld");
        }).start();
        Exam exam = new Exam(s -> 10*s.length());
    }
}
