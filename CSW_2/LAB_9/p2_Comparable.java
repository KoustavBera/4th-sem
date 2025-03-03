
import java.util.Arrays;

public class p2_Comparable implements Comparable<p2_Comparable> {

    String s;
    int v;

    //Constructor
    public p2_Comparable(String s, int v) {
        this.s = s;
        this.v = v;
    }

    public String toString() {
        return "(" + s + ", " + v + ")";
    }

    public int compareTo(p2_Comparable p) {
        //Comparable based on the string field (lexicographical order)
        if (this.s.compareTo(p.s) != 0) {
            return this.s.compareTo(p.s);
        }

        //If strings are the same, compare based on the integer value
        return this.v - p.v;
    }

    public static void main(String[] args) {
        p2_Comparable[] p = {
            new p2_Comparable("abc", 3),
            new p2_Comparable("a", 4),
            new p2_Comparable("bc", 5),
            new p2_Comparable("a", 2)
        };

        System.out.println("Before Sorting ");
        for (p2_Comparable p1 : p) {
            System.out.println(p1);
        }
        Arrays.sort(p);
        System.out.println("\nAfter sorting");
        for (p2_Comparable p1 : p) {
            System.out.println(p1);
        }
    }
}
