package basic.day191210;

public class PrivateVariable {
    static String name;
    private int age;

    public void setAge(int num){
        if (num >=0){
            age = num;
        }else{
            age = 0;
        }
    }
    int getAge(int a) {
        age += a;
        return age;
    }
}
