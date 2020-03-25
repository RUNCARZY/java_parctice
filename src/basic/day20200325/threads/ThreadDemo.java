package basic.day20200325.threads;


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        // 方法一：
        System.out.println("main1 begin");
        Thread t1 = new MyThread();
        t1.join();
        t1.start();
        System.out.println("main1 end");

        // 方法二：
        System.out.println("main2 begin");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        System.out.println("main2 end");

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread begin");
        System.out.println("thread end");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread begin");
        System.out.println("Runnable thread end");
    }
}