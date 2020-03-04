package basic.day20200227;
/*
继承关系中，父子类构造的方法特点：
1. 子类构造方法中，有一个默认隐含的super()方法，默认调用父类无参构造方法
2. 可以通过super关键字在子类构造方法中显式调用父类构造方法，此时不再默认调用super()
3. 父类构造方法只能在子类构造方法第一行调用，其他位置、其他方法不能调用
 */
public class ExtendConstructor {
    public static void main(String[] args) {
        Sun sun = new Sun();
        sun.show();
    }
}

class Father{
    int num;

    public Father() {
        this(3);
    }

    public Father(int num) {
        this.num = num;
    }

    void show () {
        System.out.println(this.num);
    }
}

class Sun extends Father {
    public Sun() {
        super(2);
    }

    public Sun(int num) {
        super();
    }

    @Override
    void show() {
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
