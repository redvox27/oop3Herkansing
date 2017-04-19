package producer_consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    }

}
