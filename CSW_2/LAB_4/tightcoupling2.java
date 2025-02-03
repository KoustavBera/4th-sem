package CSW_2.LAB_4;

class Aa {

    Aa(int x, int y) {

    }

    void foo() {
        System.out.println("Inside the foo method of base class");
    }
}

class Bb extends Aa {

        void foo() {
        System.out.println("Inside the foo method of derived class.");
    }
}

public class tightcoupling2 {

    public static void main(String[] args) {
        Bb ob = new Bb();
        ob.foo();
    }
}
