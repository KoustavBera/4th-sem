
import java.util.Arrays;

public class p3_CompareTo implements Comparable<p3_CompareTo> {

    String s;
    String v;

    //Constructor
    public p3_CompareTo(String s, String v) {
        this.s = s;
        this.v = v;
    }

    public String toString() {
        return "(" + s + " " + v + ")";
    }

    public int compareTo(p3_CompareTo p) {
        //Comparable based on the string field (lexicographical order)
        if (this.s.compareTo(p.s) != 0) {
            return this.s.compareTo(p.s);
        }

        //If strings are the same, compare based on the second value
        return this.v.compareTo(p.v);
    }

    public static void main(String[] args) {
        p3_CompareTo[] p = {
            new p3_CompareTo("Akshat", "Jhunjhuriawala"),
            new p3_CompareTo("Akshat", "Rajaji"),
            new p3_CompareTo("Akshat", "Mohanty"),
            new p3_CompareTo("Oliva", "Aggarwal"),
            new p3_CompareTo("Mr", "Bombastic")
        };

        System.out.println("Before Sorting ");
        for (p3_CompareTo p1 : p) {
            System.out.println(p1);
        }
        Arrays.sort(p);
        System.out.println("\nAfter sorting");
        for (p3_CompareTo p1 : p) {
            System.out.println(p1);
        }
    }
}
