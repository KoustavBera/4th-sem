package CSW_2.Assignments.Assignment_5;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String lowerStr1 = s1.toLowerCase();
		String lowerStr2 = s2.toLowerCase();
		String upperStr1 = s1.toUpperCase();
		String upperStr2 = s2.toUpperCase();

		boolean isEqual1 = lowerStr1.equals(lowerStr2);

		System.out.println("lowercase :" + lowerStr1 + "|" + lowerStr2);
		System.out.println("uppercase :" + upperStr1 + "|" + upperStr2);
		System.out.println("Compare : " + isEqual1);

	}
}
