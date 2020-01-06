package basic.ady200105_2String;

import java.util.Scanner;
/*
常用方法：

获取相关：
public int length(): 获取字符串长度
public String concat(String str): 拼接字符串
public char charAt(int Index): 获取指定位置的当个字符
public int indexOf(String str): 查找参数字符串首次出现在本字符串的索引位置，没有返回-1

截取字符串方法：
public String subString(int index) 截取，从索引位置到结尾
public String subString(int begin, int end) 截取，左闭右开区间

转换相关：
public char[] toCharArray(): 转换成char[]数组
public byte[] getBytes(): 获得当前字符串底层的字符数组
public String replace(CharSequence oldString, CharSequence newString)：将所有老字符串替换成新字符串
// CharSequence可以接收String类型

分割方法：
public String[] split(String regex):参数为正则表达式规则，将字符串分割为若干部分
 */


/*
练习1：定义一个方法，把数组{1,2,3}按指定格式拼接成一个字符串。格式参照如下：[Word1#Word2#Word3]
练习2：键盘输入一个字符串，统计其中各种字符的数量：大写字母，小写字母，数字，其他
 */
public class StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        String str1 = "111asdfas";
        System.out.println(str1.length());

        // 通过索引获取字符
        System.out.println(str1.charAt(0));

        // 查找子串首次出现的位置
        System.out.println(str1.indexOf("as"));
        // 找不到子串，返回-1
        System.out.println(str1.indexOf("omg"));

        // 截取字符串
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(3, 5)); //左闭右开

        // 转换成char[]数组
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+",");
        }
        System.out.println();
        // 转换成byte[]数组
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+",");
        }
        System.out.println();

        // 替换子串
        System.out.println(str1.replace("as", "帅哥"));

        // 通过正则表达式分割字符串
        String[] strs= str1.split("a");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }


//        System.out.println(new Practice1().listToString(new int[]{1, 2, 3}));
//        new Practice2().showResult();
    }
}

class Practice1{
    public String listToString(int[] list){
        String result = new String();
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                result = result.concat("Word"+list[i]);
            }else{
                result = result.concat("#Word"+list[i]);
            }
        }
        return result;
    }
}

class Practice2{
    private int[] countCharType(){
        Scanner sc = new Scanner(System.in);
        int[] result = {0, 0, 0, 0};
        System.out.println("输入字符串进行数据统计");
        String input = sc.next();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('0'<=chars[i] && chars[i]<='9'){
                result[0] ++;
            }else if ('a'<=chars[i] && chars[i]<='z'){
                result[1]++;
            }else if('A'<=chars[i] && chars[i]<='Z'){
                result[2]++;
            }else{
                result[3]++;
            }
        }
        return result;
    }
    public void showResult(){
        int[] result = this.countCharType();
        String[] map = {"数字", "小写字母", "大写字母", "其他"};
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]+":"+map[i]);
        }
    }
}