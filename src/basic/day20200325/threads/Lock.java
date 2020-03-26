package basic.day20200325.threads;




public class Lock {
    public static void main(String[] args) throws InterruptedException{
        long begin = System.currentTimeMillis();
        Thread t1 = new LockA();
        Thread t2 = new LockB();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Counter.counter);
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }


}

class Counter {
    public static final Object Lock = new Object();
    public static int counter;
}

class LockA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (Counter.Lock) {
                int a = Counter.counter;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Counter.counter = a + 1;
            }
        }
    }
}

class LockB extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized(Counter.Lock) {
                int a = Counter.counter;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Counter.counter = a - 1;
            }
        }
    }
}


