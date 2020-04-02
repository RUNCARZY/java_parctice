package basic.day20200402;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Java创建多线程的二种方式：
1、继承Thread类，重写run方法（可以使用匿名内部类）。
2、将Runnable的实现类实例，作为Thread(Runnable target)的构造方法（可以使用匿名内部类）。

使用Runnable创建线程对象的好处：
1、避免单继承的局限性
2、增强程序的扩展性，降低了程序的耦合性


Thread主要构造方法：
Thread();
Thread(String name);
Thread(Runnable target);
Thread(Runnable target, String name);


获取线程名称：
1、String getName();Thread类的方法
2、static Thread currentThread(): 获取当前的线程对象，再通过该对象getName

设置线程名称：
1、使用Thread类中的setName方法
2、使用带参构造函数

线程休眠
public static void sleep(int millis);毫秒级休眠


解决线程安全问题的方法：
1、同步代码块（安全、低效率）：synchronized(锁对象){同步代码块}
2、同步方法： 使用synchronized修饰方法，锁对象就是实现类对象（静态同步方法的锁对象是实现类本身）
3、锁机制（有丰富的内涵，值得投入时间研究）
可重入锁：java.util.concurrent.locks.ReentrantLock


线程状态：
NEW（新的）
RUNNABLE（运行中）
BLOCKED（抢占cpu）
TIME_WAITING(计时等待)
WAITING（无限等待）
TERMINATED（死亡）

synchronized锁对象使用wait(), notify(), notifyAll()等待和唤醒线程，wait时会释放锁
ReentrantLock 使用 Condition来实现线程等待与唤醒功能


线程间通信-等待唤醒机制-生产者与消费者问题


线程池：创建多个可重复利用的线程容器，节省系统资源
使用ExecutorService接口表示线程池
submit(Runnable target):添加任务并开始运行
shutdown():销毁线程池

创建线程池的方法
java.util.concurrent.Executors中的静态方法
    newSingleThreadExecutor 单线程线程池
    newFixedThreadPool 线程数固定的线程池
    newCachedThreadPool 线程数根据任务动态调整的线程池
    newScheduledThreadPool 定时线程

 */
public class ThreadDemo {
    public static void main(String[] args){
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        t1.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(MyRunnable::new);
        pool.shutdown();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm a sub thread.");
    }
}

class MyRunnable implements Runnable {
    private ReentrantLock l = new ReentrantLock();

    @Override
    public void run() {
        l.lock();
        System.out.println("I'm a runnable object.");
        l.unlock();
    }
}
