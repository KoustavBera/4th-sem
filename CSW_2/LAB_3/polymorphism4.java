package CSW_2.LAB_3;

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog {

    void eat() {
        System.out.println("eats rice");
    }
}

class cat {

    void eat() {
        System.out.println("eats rat");
    }
}

class cow {

    void eat() {
        System.out.println("eats grass");
    }
}

public class polymorphism4 {

    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.eat();
        Dog ob2 = new Dog();
        ob2.eat();
        cat ob3 = new cat();
        ob3.eat();
        cow ob4 = new cow();
        ob4.eat();

    }
}
