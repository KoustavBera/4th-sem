package CSW_2.LAB_14;

public class p5_Eh {

    public static void main(String[] args) {
        try {
            String s = "1235";
            int n = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
    }
}
