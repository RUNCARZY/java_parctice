package basic.day20200325.threads;

/*
java中，可以使用Thread()创建线程对象。
可以通过传入Runnable对象，或者覆盖重写run方法，来指定进程的方法
start方法：线程对象创建后，必须使用start方法进行启动
join方法：等待线程结束
interrupt方法：使得线程的isInterrupted()返回值为True，可用来中断进程，但必须进程对其进行响应
setDaemon(boolean b)方法: 传入true时该线程为守护线程，即主线程不需要等待该线程结束即可退出


 */
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