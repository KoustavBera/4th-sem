package CSW_2.LAB_12;

import java.util.ArrayList;
import java.util.List;

public class p2_ArrayListing {

    public static void main(String[] args) {
        //Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        //Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        //Remove element from the list
        int removeNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removeNumber);

    }
}
