// package CSW_2.Assignments.Assignment_2

import java.util.HashMap;

public class q10 {
	public static void main(String[] args) {
		int[] arr = { 1, 10, 8, 2, 4, 7, 6, 5 };
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int num : arr) {
			hmap.put(num, 1);
		}
		int smallestMissingNo = -1;
		for (int i = 1; i <= 10; i++) {
			if (!hmap.containsKey(i)) {
				smallestMissingNo = i;
				break;
			}
		}
		System.out.println("Smallest Missing No " + smallestMissingNo);
	}
}
