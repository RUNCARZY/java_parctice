package basic.day20200318_1.USBCase;

import java.util.Scanner;

/*
定义USB接口，具备最基本的开启功能和关闭功能。使用鼠标和键盘满足USB接口
 */
public class Main {
    public static void main(String[] args) {
        USB mouse = new Mouse();
        Device keyboard = new Keyboard();
//        Mouse realMouse = (Mouse)mouse;
//        Keyboard realKeyboard = (Keyboard)keyboard;

        ((Mouse) mouse).click("50, 50");

        Keyboard realKeyboard = (Keyboard) keyboard;
        realKeyboard.open();
//        realKeyboard.type('p');
        Scanner sc = new Scanner(System.in);
        char button = sc.next().toCharArray()[0];
        realKeyboard.type(button);
    }
}
