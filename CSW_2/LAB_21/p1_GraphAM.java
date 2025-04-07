package CSW_2.LAB_21;

import java.util.Scanner;

public class p1_GraphAM {

    public static void main(String[] args) {
        int[][] graph = new int[9][9];
        int k = 0, s = 0;
        Scanner sc = new Scanner(System.in);
        for (char i = 'A'; i < 'C'; i++) {
            s = 0;
            for (char j = 'A'; j < 'C'; j++) {
                System.out.println(i + " has edge with " + j + "?");
                graph[k++][s++] = sc.nextInt();
            }
        }
        k = 0;
        for (char c = 'A'; c < 'C'; c++) {
            System.out.print(" " + c + " ");
        }
        System.out.println();
        for (char i = 'A'; i < 'C'; i++) {
            s = 0;
            System.out.print(i + " ");
            for (char j = 'A'; j < 'C'; j++) {
                System.out.print(graph[k++][s++] + " ");
            }
            System.out.println();
        }
    }
}
