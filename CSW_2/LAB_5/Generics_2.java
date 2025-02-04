package CSW_2.LAB_5;

class DoublePrinter {

    Double thingToPrint;

    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

public class Generics_2 {

    public static void main(String[] args) {
        DoublePrinter num = new DoublePrinter(73.9);
        num.print();
    }
}
