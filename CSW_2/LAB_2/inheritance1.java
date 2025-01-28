package CSW_2.LAB_2;

class Animal {
//parent class

    void eat() {
        System.out.println("Eating...");
    }
}
// child class

class cat extends Animal {

    void meow() {
        System.out.println("Meowing");
    }
}

public class inheritance1 {

    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.meow();
    }
}
