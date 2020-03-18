package basic.day20200318_1.USBCase;

public class Mouse extends Device implements USB {
    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    public void click(String position){
        if (super.on_off == true) {
            System.out.println(String.format("click %s", position));
        } else {
            System.out.println("It's power-off。");
        }
    }
}
