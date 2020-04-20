package basic.day20200420.abstractProgram;
/*
lambda动态加载，可以用来优化性能。
 */
public class LambdaDynamic {
    public static void main(String[] args) {
        String msg1 = "hello1";
        String msg2 = "hello2";
        // 相对于log(int, String)的方法，可以剩下拼接字符串的性能。
        log(1, () -> msg1 + msg2);
    }

    public static void log(int level, ConStr constr) {
        if(level == 1) {
            System.out.println(constr.strCon());
        }
    }
}

@FunctionalInterface
interface ConStr {
    String strCon();
}
