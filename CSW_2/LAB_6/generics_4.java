package CSW_2.LAB_6;

public class generics_4 {

    public static void main(String[] args) {
        Integer[] a = {100, 22, 58, 41, 6, 50};
        Character[] c = {'v', 'g', 'a', 'c', 'x', 'd', 't'};
        String[] s = {"Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat"};

        System.out.println("Sorted Integer array:");
        sort_generics(a);
        printArray(a);

        System.out.println("Sorted Character array:");
        sort_generics(c);
        printArray(c);

        System.out.println("Sorted String array:");
        sort_generics(s);
        printArray(s);
    }

    public static <T extends Comparable<T>> void sort_generics(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    swap(j, j + 1, a);
                }
            }
        }
    }

    public static <T> void swap(int i, int j, T[] a) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> void printArray(T[] a) {
        for (T element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
