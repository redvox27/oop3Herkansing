package producer_consumer;

import java.util.Queue;
import java.util.Random;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class Producer implements Runnable{

    private Queue<Integer> queue = Myqueue.getQueue();

    @Override
    public synchronized void run() {
        Random random = new Random();
        int j = random.nextInt(20);
        for (int i =0; i < 11;i++){
            System.out.println("produced");
            queue.offer(i);
        }
    }
}
