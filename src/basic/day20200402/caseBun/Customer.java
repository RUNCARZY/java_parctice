package basic.day20200402.caseBun;

import java.util.Random;

public class Customer implements Runnable{
    private String name;


    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {

            try {
                BunShop.lock.lock();
                while (BunShop.bun == null) {
                    BunShop.state.await();
                }
                System.out.println(this.name + "购买中...");
                Thread.sleep(new Random().nextInt(500));
                System.out.println(this.name + " ate " + BunShop.bun.name() + "!");
                BunShop.bun = null;
                BunShop.state.signalAll();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                BunShop.lock.unlock();

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
