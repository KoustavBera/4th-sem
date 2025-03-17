// package CSW_2.Assignments.Assignment_2

import java.util.Scanner;
import java.util.TreeSet;

public class q6 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(1);
		ts.add(5);
		System.out.println(ts);
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (ts.contains(x))
			System.out.println("Number present in TreeSet");
		else
			System.out.println("Number not present in TreeSet");
		System.out.println("Enter the element to remove from TreeSet");
		int removedElement = sc.nextInt();
		ts.remove(removedElement);
		System.out.println("TreeSet after removal\n" + ts);

	}
}
