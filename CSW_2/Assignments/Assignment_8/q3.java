/*  
	* Rewrite the multithreading calculator program from Q1 using lambda expressions. 
Each arithmetic operation (addition, subtraction, multiplication, division) should still 
be handled by a separate thread, but this time, define the behavior of each thread using 
Java lambda expressions.
 */

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		// Addition thread using lambda
		Thread additionThread = new Thread(() -> {
			System.out.println("Addition: " + (a + b));
		});

		// Substraction thread using lambda
		Thread subtractionThread = new Thread(() -> {
			System.out.println("Subtraction: " + (a - b));
		});

		// Multiplication thread using lamda
		Thread multiplicationThread = new Thread(() -> {
			System.out.println("Multiplication: " + (a * b));
		});

		// Division using lambda
		Thread divisionThread = new Thread(() -> {
			try {
				System.out.println("Division: " + (a / b));
			} catch (ArithmeticException e) {
				System.out.println(e.getLocalizedMessage());
			}
		});

		// Start all threads
		additionThread.start();
		subtractionThread.start();
		multiplicationThread.start();
		divisionThread.start();

	}
}
