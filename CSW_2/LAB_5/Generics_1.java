package CSW_2.LAB_5;

class IntegerPrinter {

    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

public class Generics_1 {

    public static void main(String[] args) {
        IntegerPrinter num = new IntegerPrinter(73.9);
        num.print();
    }
}
