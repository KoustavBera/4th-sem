package CSW_2.LAB_4;

interface P {

    void foo();
}

class A implements P {

    public void foo() {
        System.out.println("In th foo method of A");
    }
}

class B implements P {

    public void foo() {
        System.out.println("In the foo method of B");
    }
}

public class loosecoupling3 {
//main method

    public static void main(String[] args) {
        B obj = new B();
        obj.foo();
    }

}
