package basic.day200105_1ArrayList;

/*
如果要使用ArrayList存放基本数据类型，可以使用对应的包装类

基本类型     包装类
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean

从jdk1.5开始，支持自动装箱、自动拆箱（基本类型与包装类型的自动转换）
*/

import java.util.ArrayList;

public class PackageClass {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        System.out.println(list);
    }
}
