package LAB_19;

public class p1_Array {

    public static void main(String[] args) {
        int[] ar1 = {0, 1, 2, 3, 4, 5};
        int[] ar2 = {0, 1, 2, 3, 4, 5};
        int[] ans = new int[6];

        for (int i = 0; i < ar1.length; i++) {
            ans[i] = ar1[i] * ar2[i];
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
