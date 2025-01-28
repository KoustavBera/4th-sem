package CSW_2.LAB_2;

public class abstraction2 {

    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("ROI SBI: " + b.getROI());
        b = new PNB();
        System.out.println("ROI PNB: " + b.getROI());
    }

}

abstract class Bank {

    abstract int getROI();
}

class SBI extends Bank {

    int getROI() {
        return 7;
    }
}

class PNB extends Bank {

    int getROI() {
        return 8;
    }
}
