package producer_consumer;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class Myqueue {

    private static Queue<Integer> queue = new LinkedBlockingQueue<>();

    public static Queue<Integer> getQueue(){
        return queue;
    }


}
