import java.util.function.Function;

public class q6_Factorial {

	public static Function<Integer, Integer> getFactorial() {
		return ((a) -> {
			int fact = 1;
			while (a > 0) {
				fact *= a;
				a--;
			}
			return fact;
		});
	}

	public static void main(String[] args) {
		Function<Integer, Integer> factorial = getFactorial();
		System.out.println("Factorial of 3 is " + factorial.apply(3));
	}
}
