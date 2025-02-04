package CSW_2.LAB_5;

public class Generics_5<I, U> {

    I obj1;
    U obj2;

    // constructor
    Generics_5(I obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print object of I and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class GL {

    public static void main(String[] args) {
        Generics_5<String, Integer> obj = new Generics_5<String, Integer>("MahaKumbh", 74);
        obj.print();
    }
}
