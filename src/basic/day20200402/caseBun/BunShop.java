package basic.day20200402.caseBun;



import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BunShop implements Runnable {
    static Lock lock = new ReentrantLock();
    static Condition state = lock.newCondition();
    static Bun bun;

    @Override
    public void run() {

        while(true) {
            try {
                BunShop.lock.lock();
                if (BunShop.bun == null){
                    if (new Random().nextBoolean()) {
                        BunShop.bun = Bun.MEAT;
                    } else {
                        BunShop.bun = Bun.VEGETABLE;
                    }
                    System.out.println("店家生产了一个包子：" +BunShop.bun.name());
                    BunShop.state.signalAll();
                } else {
                    BunShop.state.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                BunShop.lock.unlock();
            }
        }
    }
}
