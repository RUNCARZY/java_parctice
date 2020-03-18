package basic.day20200318_2;
/*
final修饰成员方法时，这个方法不能被覆盖重写，不能用于抽象方法
 */
public class FinalMemberMethod extends MemberMethod{
    /*@Override
    void whoAmI(){}   //error, final方法不能被重写*/

}

class MemberMethod {
    final void whoAmI() {
        System.out.println("I'm a final method");
    }
}