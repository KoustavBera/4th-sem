package CSW_2.LAB_22;

public class Catamor {

    public static int catamor(int[] arr) {
        return sum(arr, 0);
    }

    public static int sum(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = catamor(numbers);
        System.out.println(total);
    }
}
