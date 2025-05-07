package LAB_24;

import java.util.function.Function;

public class p1_FactorialLambaDemo {

    //Method that returns a Function<Integer, Integer> to compute factorial iteratively
    public static Function<Integer, Integer> getFactorialFunction() {

        return (n) -> {
            int fact = 1;
            //Write logic of factorial
            while (n > 0) {
                fact = fact * n;
                n--;
            }
            return fact;
        };
    }

    public static void main(String[] args) {
        //Get the factorial function
        Function<Integer, Integer> factorial = getFactorialFunction();
        int num = 7;
        System.out.println("Factorial of " + num + " is: " + factorial.apply(num));
        //Factorial of each number
        System.out.println("Factorial of numbers");
        int[] numbers = {1, 3, 5, 7, 9};
        for (int n : numbers) {
            System.out.println("factorial of array: " + factorial.apply(n));
        }
    }
}
