package CSW_2.LAB_2;

class Animal {

    void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog starts barking");
    }
}

class puppy extends Dog {

    void weeps() {
        System.out.println("puppy starts weeping");
    }
}

public class inheritance2 {

    public static void main(String[] args) {
        puppy c = new puppy();
        c.eat();
        c.bark();
        c.weeps();
    }
}
