package CSW_2.Assignments.Assignment_3;

public class q1 {

    static class NoNumericCharException extends Exception {

        public NoNumericCharException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) throws NoNumericCharException {
        String s = "stn";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                throw new NoNumericCharException("No Number allowed in String");
            } else {
                System.out.println("Status:OK");
            }
        }
    }
}
