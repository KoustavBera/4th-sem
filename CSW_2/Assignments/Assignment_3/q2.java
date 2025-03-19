package CSW_2.Assignments.Assignment_3;

public class q2 {

    // Custom Null Pointer Exception Class
    static class CustomNullPointerException extends Exception {

        public CustomNullPointerException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        String i = null;

        try {
            if (i == null) {
                throw new CustomNullPointerException("Custom Null Pointer Exception: Object is null.");
            }
        } catch (CustomNullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
