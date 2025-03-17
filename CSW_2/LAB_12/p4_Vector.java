package CSW_2.LAB_12;

import java.util.Vector;

public class p4_Vector {

    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Dog");
        animals.add(2, "ele");
        System.out.println(animals);
        Vector<String> birds = new Vector<>();
        birds.add("Iglu");
        birds.add("Dancing karoot");
        animals.addAll(birds);
        System.out.println(animals);
    }
}
