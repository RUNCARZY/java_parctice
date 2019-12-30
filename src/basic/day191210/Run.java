package basic.day191210;

public class Run {
    public static void main(String args[]){
        PrivateVariable pv = new PrivateVariable();
        pv.name = "Charles";
        pv.setAge(-1);
        System.out.println(pv.name);
        System.out.println(pv.getAge(0));
        System.out.println(pv.getAge(1));
        System.out.println(pv.getAge(0));
    }
}
