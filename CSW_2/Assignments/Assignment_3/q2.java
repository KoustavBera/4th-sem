package CSW_2.Assignments.Assignment_3;

public class q2 {

    static class CustomNullPointerException extends Exception {

        public CustomNullPointerException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) throws CustomNullPointerException {
        String i = null;
        try {
            if (i == null) {
                throw new CustomNullPointerException("String cannot be null");
            }
        } catch (CustomNullPointerException e) {
            System.out.println("message:" + e.getMessage());
        }

    }
}
