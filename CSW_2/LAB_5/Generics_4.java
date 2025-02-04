package CSW_2.LAB_5;

class IntegerPrinter<T> {

    T thingToPrint;

    public IntegerPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

public class Generics_4 {

    public static void main(String[] args) {
        // IntegerPrinter<Double> num = new IntegerPrinter<>(73.9);
        // num.print();
        IntegerPrinter<String> num = new IntegerPrinter("box");
        num.print();
    }
}
