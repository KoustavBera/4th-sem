
import java.util.PriorityQueue;
import java.util.Queue;

public class p1_pq {

    public static void main(String[] args) {
        //Creating empty priority queue
        Queue<String> pQueue = new PriorityQueue<>();

        //Adding items to the pqueue using add()
        pQueue.add("ram");
        pQueue.add("ram");
        pQueue.add("ram");
        pQueue.add("ram");
        //PRINT THE QUEUE
        System.out.println("Queue: " + pQueue);

        //DO A POLL OPS
        System.out.println(pQueue.poll());

        //ADD 2 more Strings
        pQueue.add("sam");
        pQueue.add("jodhu");

        //PRINT QUEUE
        System.out.println(pQueue);
    }
}
