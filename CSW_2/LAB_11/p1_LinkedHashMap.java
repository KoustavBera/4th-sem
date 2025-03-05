package LAB_11;

import java.util.LinkedHashMap;
import java.util.Map;

public class p1_LinkedHashMap {

    public static void main(String[] args) {
        //Create a LinkedHashMap to store student IDs and their corresponding names
        Map<Integer, String> studentMap = new LinkedHashMap<>();
        //Adding some student records to linkedhashmap
        studentMap.put(1003, "Ramkanta Roul");
        studentMap.put(1001, "Ramkanta Roul1");
        studentMap.put(1002, "Ramkanta Roul2");
        studentMap.put(1004, "Ramkanta Roul3    ");
        //Iterating over the entries of the TreeMap anb printing each key value pair
        System.out.println("Student Records: ");
        for (Map.Entry<Integer, String> e : studentMap.entrySet()) {
            System.out.println("ID: " + e.getKey() + ", Name: " + e.getValue());
        }

        int studentIdToFind = 1002;
        String studentName = studentMap.get(studentIdToFind);
        if (studentName != null) {
            System.out.println("Student with ID " + studentIdToFind + " is: " + studentName);
        } else {
            System.out.println("Student with ID " + studentIdToFind + " not found ");
        }
        System.out.println("removed:" + studentMap.remove(1002));
        System.out.println(studentMap);
    }

}
