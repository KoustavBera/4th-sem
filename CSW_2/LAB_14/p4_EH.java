package CSW_2.LAB_14;

public class p4_EH {

    public static void main(String[] args) {
        int[] A = new int[4];
        try {
            int i = A[4];
            System.out.println("Inside the try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch block");
        }
    }
}
