package CSW_2.LAB_5;

class StringPrinter {

    String thingToPrint;

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

public class Generics_3 {

    public static void main(String[] args) {
        StringPrinter num = new StringPrinter("iiii");
        num.print();
    }
}
