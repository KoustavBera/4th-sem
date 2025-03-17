package CSW_2.LAB_12;

import java.util.*;

public class p1_ArrayList {

    public static void main(String[] args) {

        int n = 5;
        List<Integer> arrli = new ArrayList<Integer>(n);
        //Appending the new elements at the end of the list
        for (int i = 1; i <= n; i++) {
            arrli.add(i);
        }
        //Printing elements
        System.out.println(arrli);

        //Remove element at index 3
        arrli.remove(3);

        //Displaying the list after the deletion
        System.out.println(arrli);

        //Printing the  elements one by one
        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }
    }
}
