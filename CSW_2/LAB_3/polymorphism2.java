package CSW_2.LAB_3;

class Multiply {

    static int Multi(int a, int b) {
        return a * b;
    }

    static double Multi(double a, double b) {
        return a * b;
    }
}

class Addition {

    static int Add(int a, int b) {
        return a + b;
    }

    static int Add(int a, int b, int c) {
        return a + b + c;
    }
}

public class polymorphism2 {

    public static void main(String[] args) {
        System.out.println(Multiply.Multi(2, 5));
        System.out.println(Multiply.Multi(2.5, 5.5));
        System.out.println(Addition.Add(2, 3));
        System.out.println(Addition.Add(2, 3, 5));
    }
}
