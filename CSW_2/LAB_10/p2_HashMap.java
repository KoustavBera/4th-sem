package CSW_2.LAB_10;

import java.util.HashMap;
import java.util.Map;

public class p2_HashMap {

    public static void main(String[] args) {
        //Create a HasMap to store student IDs and their corresponding names
        Map<Integer, String> studentMap = new HashMap<>();
        //Adding some student records to the HashMap
        studentMap.put(1001, "Piyush M");
        studentMap.put(1002, "Soumya P");
        studentMap.put(1003, "Manish S");
        studentMap.put(1005, "Prakruti S");
        // Retrieveing and printing a students name based on their ID
        int studentIdToFind = 1002;
        String studentName = studentMap.get(studentIdToFind);
        if (studentName != null) {
            System.out.println("Student with ID " + studentIdToFind + "is: " + studentName);
        } else {
            System.out.println("Student with ID" + studentIdToFind + "not found/");
        }
        //Iterating over the entries of the HashMap and printing each key-value pair
        System.out.println("Student Records: ");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        //Checking if a student ID exists in the HashMap
        int idToCheck = 1004;
        boolean exists = studentMap.containsKey(idToCheck);
        System.out.println("Student with ID " + idToCheck + " exists in records: " + exists);
        String s = studentMap.remove(1001);
        System.out.println(s);
        System.out.println(studentMap);
    }
}
