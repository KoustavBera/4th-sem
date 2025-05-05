package CSW_2.LAB_23;

interface calculator {

    double calculate(double x, double y);
}

public class p3_calculator {

    public static void main(String[] args) {
        calculator add = (x, y) -> x + y;
        calculator sub = (x, y) -> x - y;
        calculator mul = (x, y) -> x * y;
        calculator div = (x, y) -> {
            if (y == 0) {
                System.out.println("Division by zero not allowed");
                return 0;
            }
            return x / y;
        };
        double x = 12, y = 0;
        System.out.println("Addition" + add.calculate(x, y));
        System.out.println("Addition" + sub.calculate(x, y));
        System.out.println("Addition" + mul.calculate(x, y));
        System.out.println("Addition" + div.calculate(x, y));
    }
}
