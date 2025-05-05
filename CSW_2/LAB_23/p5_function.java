
import java.util.function.Function;

public class p5_function {

    public static Function<Integer, Integer> getSquareFunction() {
        return (n) -> n * n;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squaeFunction = getSquareFunction();
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 17, 19};
        for (int x : numbers) {
            int square = squaeFunction.apply(x);
            System.out.println("Square of" + x + " is " + square);
        }
    }
}
