package CSW_2.Assignments.Assignment_5;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char[] charArr = s1.toCharArray();
		char c = sc.next().charAt(0);
		int first = s1.indexOf(c);
		int last = s1.lastIndexOf(c);
		System.out.println(charArr);
		System.out.println(first + "," + last);
	}
}
