package LAB_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class p2_HashSet {

    public static void main(String[] args) {
        Set<String> h = new HashSet<String>();
        //Custom input elements
        h.add("Odisha");
        h.add("West Bengal");
        h.add("Jharkhand");
        h.add("Michigan");

        //Adding the duplicate element
        h.add("Odisha");
        //Displaying the HashSet
        System.out.println(h);
        h.remove("Michigan");
        System.out.println("Set after removing Bihar: " + h);

        //Iterating over hash set itemns
        System.out.println("Iterating over set: ");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
