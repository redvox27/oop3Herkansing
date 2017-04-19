package producer_consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Producer());
        executorService.execute(new Consumer());
        executorService.shutdown();

        System.out.println(Myqueue.getQueue().size());
    }

}
