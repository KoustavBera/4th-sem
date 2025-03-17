// package CSW_2.Assignments.Assignment_2

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		System.out.println("************* Valid Anagrams **********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String word1 = sc.next();
		String word2 = sc.next();
		if (checkAna(word1, word2)) {
			System.out.println("The two words are Anagrams\n");
		} else {
			System.out.println("The two words are not Anagrams\n");
		}
	}

	private static boolean checkAna(String word1, String word2) {
		HashMap<Character, Integer> sMap = new HashMap<>();
		if (word1.length() != word2.length())
			return false;

		for (int i = 0; i < word1.length(); i++) {
			char c1 = word1.charAt(i);
			sMap.put(c1, sMap.getOrDefault(c1, 0) + 1); // Use getOrDefault to handle null
		}
		for (int i = 0; i < word2.length(); i++) {
			char c2 = word2.charAt(i);
			sMap.put(c2, sMap.getOrDefault(c2, 0) - 1); // Use getOrDefault to handle null
		}
		for (Map.Entry<Character, Integer> s : sMap.entrySet()) {
			if (s.getValue() != 0)
				return false;
		}
		return true;
	}
}
