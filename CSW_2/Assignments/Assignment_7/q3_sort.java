import java.util.Arrays;
import java.util.List;

public class q3_sort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Pineapple", "Mousambi");

		// sort using custom comparator
		list.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

		list.forEach((fruit) -> System.out.println(fruit));
	}

}
