package basic.day20200401;

import java.util.*;
/*
jdk1.9新特性：
List、Set、Map接口：新增静态方法of,可以一次性给集合中添加多个元素
static <E> list<E> of (E...elements): 适用于长度不变的集合
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        for (int i = 0; i < 5; i++) {
            in = sc.next();
//            Map<Character, Integer> count = CharCount.count(in);
/*            Set<Map.Entry<Character, Integer>> result= count.entrySet();
            for (Map.Entry entry : result) {
                System.out.println(String.valueOf(entry.getKey()) + ':' + entry.getValue());
            }*/
/*            Map<Character, Integer> count = CharCount.count(in);
            Set result= count.entrySet();
            for (Map.Entry entry :(Iterable<Map.Entry>) result) {
                System.out.println(String.valueOf(entry.getKey()) + ':' + entry.getValue());
            }*/
            for (Map.Entry<Character, Integer> entry: CharCount.count(in).entrySet()) {
                System.out.println(String.valueOf(entry.getKey()) + ':' + entry.getValue());
            }
        }
    }
}

class CharCount {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars= str.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar)+1);
            } else {
                map.put(aChar, 1);
            }
        }
        return map;
    }

}