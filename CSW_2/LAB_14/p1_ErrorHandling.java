package CSW_2.LAB_14;

public class p1_ErrorHandling {

    public static void main(String[] args) {
        int v1 = 5 + 4 * 3 / 2;
        int v2 = (5 + 4) * 3 / 2;
        int v3 = (5 + 4) * (3 / 2);
        int v4 = (5 + (4 * 3) / 2);
        System.out.println(v1 + "," + v2 + "," + v3 + "," + v4);
    }
}
