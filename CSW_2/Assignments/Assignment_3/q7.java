package CSW_2.Assignments.Assignment_3;

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);

        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix A:");
        print(A);
        System.out.println("Matrix B:");
        print(B);

        System.out.println("\nAddition:");
        print(add(A, B));

        System.out.println("\nMultiplication:");
        print(mul(A, B));

        System.out.println("\nTranspose of A:");
        print(trans(A));

        System.out.print("\nEnter row and col to access: ");
        int r = sc.nextInt(), c = sc.nextInt();

        try {
            System.out.println("Element: " + A[r][c]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index (" + r + "," + c + ")");
        }
        sc.close();
    }

    static int[][] add(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }

    static int[][] mul(int[][] A, int[][] B) {
        int r = A.length, c = B[0].length, sum;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum = 0;
                for (int k = 0; k < A[0].length; k++) {
                    sum += A[i][k] * B[k][j];
                }
                res[i][j] = sum;
            }
        }
        return res;
    }

    static int[][] trans(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }

    static void print(int[][] M) {
        for (int[] row : M) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
