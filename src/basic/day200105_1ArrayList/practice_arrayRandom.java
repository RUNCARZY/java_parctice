package basic.day200105_1ArrayList;
import java.util.Random;
import java.util.ArrayList;
/*
练习1：生成6个1-33之间的随机整数，添加到集合，并遍历集合
练习2：定义以指定格式打印集合的方法(ArrayList类型作为参数，使用{}阔起集合,用@分隔)
练习3：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中

 */
public class practice_arrayRandom {
    public static void main(String[] args) {
        // 练习1：
//        new practice1().visitList();

        // 练习2：
//        ArrayList<String> list = new ArrayList<>();
//        list.add("ming");
//        list.add("bai");
//        list.add("ma");
//        new practice2().print(list);

        // 练习3：
        System.out.println(new practice3().getEvenList());
    }
}

class practice1{
    private ArrayList<Integer> list = new ArrayList<>();

    public practice1() {
        this.generator();
    }

    private ArrayList<Integer> generator(){
        Random rd = new Random();
        for (int i = 0; i <6 ; i++) {
            this.list.add(rd.nextInt(33) + 1);
        }
        return this.list;
    }

    public void visitList(){
        int length = this.list.size();
        for (int i = 0; i < length; i++) {
            System.out.println(this.list.get(i));
        }
    }

}

class practice2{

    public String print(ArrayList<String> list){
        String result = "{";
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1){
                result += list.get(i) + "@";
            }else{
                result += list.get(i) + "}";
            }
        }
        System.out.println(result);
        return result;
    }

}

class practice3{
//    练习3：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
    private ArrayList<Integer> evenList = new ArrayList<>();

    private ArrayList<Integer> intListGenerator(){
        ArrayList<Integer> intList = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i <20 ; i++) {
            intList.add(rd.nextInt());
        }
        return intList;
    }

    public practice3() {
        evenFilter();
    }

    private void evenFilter(){
        ArrayList<Integer> intList = intListGenerator();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i)%2 == 0){
                this.evenList.add(intList.get(i));
            }
        }
    }

    public ArrayList<Integer> getEvenList() {
        return evenList;
    }
}
