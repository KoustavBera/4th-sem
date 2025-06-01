/*   
	* Q2. Write a Java program to create a simple calculator that performs arithmetic operations 
(addition, subtraction, multiplication, division) using multiple threads. Each 
arithmetic operation should be handled by a separate thread
 */

import java.util.Scanner;

class AddThread extends Thread {
	int a, b;

	AddThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		System.out.println("Addition: " + (a + b));
	}
}

class SubThread extends Thread {
	int a, b;

	SubThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		System.out.println("Subtraction: " + (a - b));
	}
}

class MulThread extends Thread {
	int a, b;

	MulThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		System.out.println("Multiplication: " + (a * b));
	}
}

class DivThread extends Thread {
	int a, b;

	DivThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		try {
			System.out.println("Division: " + (a / b));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
	}
}

public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();

		AddThread add = new AddThread(x, y);
		SubThread sub = new SubThread(x, y);
		MulThread mul = new MulThread(x, y);
		DivThread div = new DivThread(x, y);

		add.start();
		sub.start();
		mul.start();
		div.start();
	}
}
