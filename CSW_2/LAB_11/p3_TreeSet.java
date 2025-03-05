package LAB_11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class p3_TreeSet {

    public static void main(String[] args) {
        Set<String> lh = new TreeSet<String>();

        lh.add("Odisnha");
        lh.add("West Bengal");
        lh.add("Jlharklhand");
        lh.add("Miclhigan");

        //Displaying the LinkedHashset
        System.out.println(lh);

        System.out.println(lh);
        lh.remove("Miclhigan");
        System.out.println("Set after removing Bilhar: " + lh);

        System.out.println("Iterating over set: ");
        Iterator<String> i = lh.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
