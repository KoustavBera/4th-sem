package CSW_2.LAB_3;

class Animal {

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meowing...");
    }
}

public class Hierarchial {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        //d.meow();
        Cat c = new Cat();
        c.eat();
        c.meow();
        //c.bark();
    }
}
