package day20200317;
/*
assert用于开发测试阶段。
使用-ea, 不然系统会默认跳过断言
在Run-Edit Configuration-VM Option中添加
 */
public class AssertDemo {
    public static void main(String[] args) {
        int x = 1;
        assert x < 0;
        System.out.println(x);
    }
}
