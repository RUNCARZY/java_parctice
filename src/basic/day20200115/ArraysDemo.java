package basic.day20200115;
import java.util.Arrays;


/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操纵的操作。

public static String toString(数组): 将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3]）
public void String sort(数组)：将数组排序（默认升序）
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] list = {54, 2134, 34};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
