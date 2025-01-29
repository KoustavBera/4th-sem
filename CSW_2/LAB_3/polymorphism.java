package CSW_2.LAB_3;

class person {

    void Role() {
        System.out.println("I am Man");
    }
}

class son extends person {

    void Role() {
        System.out.println("I am son");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        person p = new son();
        p.Role();
    }
}
