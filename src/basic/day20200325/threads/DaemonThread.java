package basic.day20200325.threads;



public class DaemonThread {
    public static void main(String[] args) {
        Thread t1 = new Daemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("main thread ended!");
    }
}

class Daemon extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(begin-end);
    }
}
