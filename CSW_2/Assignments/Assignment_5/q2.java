package CSW_2.Assignments.Assignment_5;

// Write a Java program that demonstrates the immutability of the String class and how it 
// implements the CharSequence interface. Your program should illustrate the 
// behaviours that highlight String immutability and its usage as a CharSequence. 
public class q2 {
	public static void main(String[] args) {
		// immutability of string
		String org = "Hello";
		String modified = org.concat("World");
		System.out.println("Original string == " + org);
		System.out.println("After concatenation == " + modified);
		// checking original string after modification
		System.out.println("Original string after modification == " + org);// still "World"

		CharSequence charSeq = org;
		System.out.println("\n String as CharSequence ");
		System.out.println("Length == " + charSeq.length());
		System.out.println("character at index" + 4 + " == " + charSeq.charAt(4));
		System.out.println("Character subsequence == " + charSeq.subSequence(1, 4));
	}
}
