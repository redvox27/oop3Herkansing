package producer_consumer;

import java.util.Queue;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class Consumer implements Runnable {

    private Queue<Integer> queue = Myqueue.getQueue();

    @Override
    public synchronized void run() {
        while(queue.isEmpty()){
            System.out.println("lege lijst");
        }
        while(!queue.isEmpty()){

               int value = queue.peek();
               System.out.println(" polled: " + value);
               queue.remove(queue.peek());



       }


    }
}
