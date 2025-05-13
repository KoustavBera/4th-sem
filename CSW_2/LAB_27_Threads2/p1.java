
public class p1 extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new p1();
        Thread t2 = new p1();
        Thread t3 = new p1();
        t1.start();
        t2.start();
        t3.start();
    }
}
