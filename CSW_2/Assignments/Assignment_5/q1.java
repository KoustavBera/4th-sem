package CSW_2.Assignments.Assignment_5;

public class q1 {

	public static void main(String[] args) {
		// String literals: stored in the string pool (inside the method area)
		String str1 = "hello";
		String str2 = "hello";

		// New String objects: stored in the heap memory (outside the string pool)
		String str3 = new String("hello");
		String str4 = new String("hello");

		// String literals refer to the same object in the string pool
		System.out.println("Comparing string literals str1, str2 (==): " + (str1 == str2)); // true

		// New String objects are created separately in the heap, so their references
		// are different
		System.out.println("Comparing new string objects str3, str4 (==): " + (str3 == str4)); // false

		// A new String object (str3) is in the heap, while str1 refers to the string
		// pool
		System.out.println("Comparing string literal and new string object str1, str3 (==): " + (str1 == str3)); // false

		// .equals() checks the content, not memory reference, so it returns true
		System.out.println("Comparing new string objects str3, str4 using .equals(): " + (str3.equals(str4))); // true

		// .equals() checks the content, and str1 & str2 have the same content
		System.out.println("Comparing string literals str1, str2 using .equals(): " + (str1.equals(str2))); // true

		// .equals() checks the content, and both str1 (literal) and str3 (new object)
		// have "hello"
		System.out
				.println("Comparing new string object and string literal str1, str3 using .equals(): " + (str1.equals(str3))); // true
	}
}
