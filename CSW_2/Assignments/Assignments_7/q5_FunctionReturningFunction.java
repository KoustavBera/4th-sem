import java.util.function.Function;

public class q5_FunctionReturningFunction {

	public static Function<Integer, Integer> getSquare() {
		return (x) -> x * x;
	}

	public static void main(String[] args) {

		Function<Integer, Integer> square = getSquare();
		int a = 2;
		int b = 3;

		System.out.println("Square of " + a + " : " + square.apply(a));
		System.out.println("Square of " + b + " : " + square.apply(b));
	}
}
