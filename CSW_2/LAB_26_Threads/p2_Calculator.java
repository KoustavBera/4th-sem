
class AdditionThread extends Thread {

    private double m, n;

    public AdditionThread(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        double r = m + n;
        System.out.println("Addition " + r);
    }
}

class SubstractionThread extends Thread {

    private double m, n;

    public SubstractionThread(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        double r = m - n;
        System.out.println("Subtraction " + r);
    }
}

class MultiplicationThread extends Thread {

    private double m, n;

    public MultiplicationThread(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        double r = m * n;
        System.out.println("Multiplication " + r);
    }
}

class DivisionThread extends Thread {

    private double m, n;

    public DivisionThread(double m, double n) {
        this.m = m;
        this.n = n;
    }

    public void run() {
        double r = m / n;
        if (n == 0) {
            System.out.println("Cannot divide by 0");
            return;
        }
        System.out.println("Divison " + r);
    }
}

public class p2_Calculator {

    public static void main(String[] args) {
        Thread addThread = new AdditionThread(1, 2);
        Thread subThread = new SubstractionThread(1, 2);
        Thread mulThread = new MultiplicationThread(1, 2);
        Thread divThread = new DivisionThread(2, 1);
        Thread divThread2 = new DivisionThread(2, 0);

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
        divThread2.start();
    }

}
