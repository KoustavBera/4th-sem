package CSW_2.Assignments.Assignment_5;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();

		while (true) {
			System.out.println("1: convert string to upper/lower case");
			System.out.println("2: search for a character");
			System.out.println("3: concatenate with other string");
			System.out.println("4: exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("uppercase" + str.toUpperCase());
					System.out.println("lowercase" + str.toLowerCase());
					break;
				case 2:
					char c = sc.next().charAt(0);
					if (str.indexOf(c) != -1) {
						System.out.println("success");
					} else {
						System.out.println("failure");
					}
					break;

				case 3:
					sc.nextLine();
					String str2 = sc.nextLine();
					String concated = str.concat(str2);
					System.out.println(concated);
					break;

				case 4:
					sc.close();
					return;

				default:
					System.out.println("invalid choice");
			}
		}
	}
}
/*
 * OUTPUT
 * Enter a string
 * HIi
 * 1: convert string to upper/lower case
 * 2: search for a character
 * 3: concatenate with other string
 * 4: exit
 * Enter choice
 * 4
 */