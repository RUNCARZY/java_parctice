package basic.day20200421;

public class Human {
    public int num = 100;
    private int i = 10;

    public Human() {
    }

    private Human(int num, int i) {
        this.num = num;
        this.i = i;
    }

    public int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }
}
