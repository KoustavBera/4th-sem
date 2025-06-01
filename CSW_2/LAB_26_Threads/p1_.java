
class MyThread extends Thread {

    public void run() {
        System.out.println("my thread is running");
    }

}

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Runnable Thread Running");
    }
}

public class p1_ {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
