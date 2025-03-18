package CSW_2.Assignments.Assignment_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q9 {
	public static void main(String[] args) throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer");
		try {
			int x = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
		}
	}
}
