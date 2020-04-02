package basic.day20200402.caseBun;

public class Main {
    public static void main(String[] args) {

        Thread provider = new Thread(new BunShop());
        Thread customer1 = new Thread(new Customer("花木兰"));
        Thread customer2 = new Thread(new Customer("露娜"));

        customer1.start();
        customer2.start();
        provider.start();
        try {
            provider.join();
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
