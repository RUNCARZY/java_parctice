package basic.day20200402;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class LogDemo {
    public static void main(String[] args) {

        Log log = LogFactory.getLog(LogDemo.class);
//        Log log = LogFactory(getclass());//getclass()在实例方法中使用，子类可以直接使用该实例

        Dad sun = new Sun();
        sun.who();
        Sun sun1 = new Sun();
        sun1.setA(20);
        log.debug("子类"+sun1.get());
        log.debug("父类"+sun1.getA());
    }
}

class Dad{
    public int a = 10;

    public static void who() {
        System.out.println("Dad");
    }

    public int getA(){
        return this.a;
    }
}

class Sun extends Dad {
    public int a;
    public static void who() {
        System.out.println("Sun");
    }

    public void setA(int num) {
        this.a = num;
    }

    public int get() {
        return this.a;
    }


}
