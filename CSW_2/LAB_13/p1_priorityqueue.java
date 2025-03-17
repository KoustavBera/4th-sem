
import java.util.PriorityQueue;
import java.util.Queue;

public class p1_priorityqueue {

    public static void main(String[] args) {
        //Creating empty priority queue
        Queue<Integer> pQueue = new PriorityQueue<>();

        //Adding items to the pqueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(11);
        System.out.println("Queue: " + pQueue);

        //Printing the top element of the Priority Queue
        System.out.println(pQueue.peek());

        //Printing the top element and removing it from the PriorityQueue container
        System.out.println(pQueue.poll());

        //Printing the top element again
        System.out.println(pQueue.peek());
    }
}
