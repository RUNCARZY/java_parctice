package basic.day20200325.threads;

public class Interrupt {
    public static void main(String[] args) throws InterruptedException{
        InterruptThread t1 = new InterruptThread();
        t1.start();
        Thread.sleep(200);
        t1.interrupt();
        t1.join();
    }

}

class InterruptThread extends Thread {
    @Override
    public void run() {
        for (int i=0;!isInterrupted(); i++) {
            System.out.println(i);
        }
    }
}