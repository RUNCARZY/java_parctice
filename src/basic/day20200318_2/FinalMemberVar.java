package basic.day20200318_2;
/*
final用于修饰成员变量，成员变量也是不可变的，由于成员变量具有默认值，所以必须手动对其进行赋初值。
赋值方法：
1. 声明成员变量时手动赋值
2. 在所有的构造方法中对其赋值
 */
public class FinalMemberVar {
    final String menber1 = "Petter"; // 声明时赋值
    final String menber2; // 声明时不赋值，在所有构造函数中赋值
//    final String menber3; // error, 不可以不赋值

    public FinalMemberVar(String menber2) {
        this.menber2 = menber2;
    }

    public FinalMemberVar() {
        this.menber2 = new String();
    }
}
