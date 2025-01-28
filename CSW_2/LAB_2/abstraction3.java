package CSW_2.LAB_2;

abstract class Bike {

    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear is changed");
    }
}

class Yamaha extends Bike {

    void run() {
        System.out.println("Running smoothly");
    }
}

public class abstraction3 {

    public static void main(String[] args) {
        Bike y = new Yamaha();
        y.run();
        y.changeGear();
    }
}
