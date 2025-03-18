package CSW_2.Assignments.Assignment_3;

import java.util.Arrays;

public class q6 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] arr = { 1, 3, 5, 2, 7, 9, 0 };
		// Sorting
		Arrays.sort(arr);
		// search
		int target = 9;
		for (int i : arr) {
			if (i == target)
				System.out.println("success.status(200)");
		}
		// accessing
		try {
			System.out.println(arr[arr.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());
		}
	}
}
