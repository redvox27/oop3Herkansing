package producer_consumer;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class Main {

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
        System.out.println(Myqueue.getQueue().size());
    }

}
