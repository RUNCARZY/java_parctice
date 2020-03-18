package basic.day20200318_1.USBCase;

public class Keyboard  extends Device implements USB{


    public void type(char button){
        if (super.on_off == true) {
            System.out.println(String.format("press %c", button));
        } else{
            System.out.println("It's power-off");
        }

    }
}
