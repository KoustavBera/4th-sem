
class MyTask implements Runnable {

    public void run() {
        System.out.println("Running the task " + Thread.currentThread());
    }

}

public class p2_Concurrency {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask());
        t1.start();
        t2.start();
    }
}
