import java.util.Scanner;

class Printer {
	private int number = 1;
	private int max;

	public Printer(int max) {
		this.max = max;
	}

	public synchronized void printOdd() {
		while (number <= max) {
			if (number % 2 == 0) {
				try {
					wait(); // wait if it's not this thread's turn
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} else {
				System.out.println("Odd: " + number);
				number++;
				notify(); // wake up the even thread
			}
		}
	}

	public synchronized void printEven() {
		while (number <= max) {
			if (number % 2 != 0) {
				try {
					wait(); // wait if it's not this thread's turn
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} else {
				System.out.println("Even: " + number);
				number++;
				notify(); // wake up the odd thread
			}
		}
	}
}

public class q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of max");
		int max = sc.nextInt();

		Printer printer = new Printer(max);
		Thread oddThread = new Thread(() -> printer.printOdd());
		Thread evenThread = new Thread(() -> printer.printEven());

		oddThread.start();
		evenThread.start();
		sc.close();
	}
}
