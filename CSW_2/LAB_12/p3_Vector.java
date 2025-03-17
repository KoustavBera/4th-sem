package CSW_2.LAB_12;

import java.util.List;
import java.util.Vector;

public class p3_Vector {

    public static void main(String[] args) {
        int n = 5;
        List<Integer> v = new Vector<Integer>(n);
        for (int i = 1; i <= n; i++) {
            v.add(i);
            //Printing elements
        }
        System.out.println(v);
        //Remove element index at 3
        v.remove(3);
        System.out.println(v);
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
