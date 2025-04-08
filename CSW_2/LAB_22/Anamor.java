package CSW_2.LAB_22;

import java.util.ArrayList;
import java.util.List;

public class Anamor {

    public static List<Integer> anamor(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<Integer> op = anamor(n - 1);
        op.add(n);
        return op;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> num = anamor(n);
        System.out.println(num);
    }

}
