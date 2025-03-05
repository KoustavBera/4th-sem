
import java.util.Map;
import java.util.TreeMap;

public class p4_HashMap {

    public static void main(String[] args) {
        //Creating a TreeMap to store student IDs and their corresponding name
        TreeMap<Integer, String> studentMap = new TreeMap<>();
        //Addinbg some student records to the TreeMap
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
    }
}
