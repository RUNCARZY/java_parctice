package basic.day20200401;

import java.util.regex.*;

public class ReDemo {
    public static void main(String[] args) {
        String re = "\\d{3,4}-\\d{7,8}";
        String[] phones = {"010-22229999", "0203-4441235", "213-erae", "09873321345"};
        for (String phone : phones) {
            if (phone.matches(re)) {
                System.out.println(phone+" matched!");
            }else {
                System.out.println(phone+" unmatched!");
            }
        }
        new Object().hashCode();
    }
}
