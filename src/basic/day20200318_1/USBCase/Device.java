package basic.day20200318_1.USBCase;

public class Device implements USB{
    boolean on_off = false;

    @Override
    public void open() {
        this.on_off = true;
    }

    @Override
    public void close() {
        this.on_off = false;

    }
}
