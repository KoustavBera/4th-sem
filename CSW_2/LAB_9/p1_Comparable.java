
import java.util.Arrays;
import java.util.Scanner;

public class p1_Comparable implements Comparable<p1_Comparable> {

    int v;

    public p1_Comparable(int v) {
        this.v = v;
    }

    public String toString() {
        return String.valueOf(v);
    }

//CompareTo() method to define sorting logic
    @Override
    public int compareTo(p1_Comparable ob) {

        //  Ascending order
        return this.v - ob.v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p1_Comparable[] n = {new p1_Comparable(14), new p1_Comparable(11), new p1_Comparable(17), new p1_Comparable(12)};
        System.out.println("Before sorting " + Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("After sorting: " + Arrays.toString(n));
    }
}
