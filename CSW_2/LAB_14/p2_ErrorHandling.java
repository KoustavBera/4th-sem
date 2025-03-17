package CSW_2.LAB_14;

public class p2_ErrorHandling {

    public static void main(String[] args) {
        int n = 87325;
        int revnum = 0;
        int rem;
        while (n != 0) {
            rem = n % 10;
            revnum = revnum * 10 + rem;
            n /= 10;
        }
        System.out.println(revnum);

    }
}
