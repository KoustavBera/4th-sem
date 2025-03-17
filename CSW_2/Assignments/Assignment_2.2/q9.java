// package CSW_2.Assignments.Assignment_2

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class q9 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, -2, 3, 5, 3, -2, 2, 1, 3 };
		identifyAndPrintRepeatedIntegers(arr);
	}

	private static void identifyAndPrintRepeatedIntegers(int[] arr) {
		HashSet<Integer> hs = new HashSet<>();
		TreeSet<Integer> al = new TreeSet<>();
		for (int i : arr) {
			if (!hs.contains(i)) {
				hs.add(i);
			} else {
				al.add(i);
			}
		}
		System.out.println("Repeated Integers :");
		for (int i : al) {
			System.out.println(i);
		}
	}
}
