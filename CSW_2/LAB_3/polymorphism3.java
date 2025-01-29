package CSW_2.LAB_3;

class Bike {

    void run() {
        System.out.println("Running... ");
    }
}

class splendor extends Bike {

    void run() {
        System.out.println("splendor running...");
    }
}

public class polymorphism3 {

    public static void main(String[] args) {
        Bike b = new splendor();
        b.run();
    }
}
