package CSW_2.Assignments.Assignment_5;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String word1 = sc.next();
		String word2 = sc.next();
		boolean hasWord = sentence.contains(word1);
		System.out.println(hasWord);
		int index = sentence.indexOf(word1);
		String replaceString = sentence.substring(0, index) + word2 +
				sentence.substring(index + word1.length());
		System.out.println(replaceString);
	}
}
