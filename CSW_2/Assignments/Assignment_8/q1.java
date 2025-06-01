/* Write a Java program to demonstrate performing multiple tasks concurrently using 
multiple threads.  
Create two separate thread classes: 
• The first thread should calculate and print the sum of the first 100 natural 
numbers. 
• The second thread should display the multiplication table of a given number  
Start both threads from the main() method and show that the tasks run 
concurrently.  */

class SumThread extends Thread {
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Sum of first 100" + sum);

	}
}

class MultiplicationTableThread extends Thread {
	int number;

	MultiplicationTableThread(int number) {
		this.number = number;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class q1 {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		MultiplicationTableThread multiplicationTableThread = new MultiplicationTableThread(5);

		sumThread.start();
		multiplicationTableThread.run();
	}
}