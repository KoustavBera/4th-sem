/*   
	* Write a Java program to multiply two matrices using multithreading. Divide the task 
of multiplying rows of the matrices among multiple threads to improve performance.
 */

class RowMultiplierThread extends Thread {
	private int[][] A, B, result;
	private int row;

	public RowMultiplierThread(int[][] A, int[][] B, int[][] result, int row) {
		this.A = A;
		this.B = B;
		this.result = result;
		this.row = row;
	}

	public void run() {
		int colsB = B[0].length;
		int colsA = A[0].length;

		for (int j = 0; j < colsB; j++) {
			result[row][j] = 0;
			for (int k = 0; k < colsA; k++) {
				result[row][j] += A[row][k] * B[k][j];
			}
		}
	}
}

public class q4 {
	public static void main(String[] args) {
		int[][] A = {
				{ 1, 2 },
				{ 3, 4 }
		};

		int[][] B = {
				{ 5, 6 },
				{ 7, 8 },
		};

		int rowA = A.length;
		int colsA = A[0].length;
		int colsB = B[0].length;

		if (colsA != B.length) {
			System.out.println("Matrix multiplication not possible. ");
			return;
		}

		int[][] result = new int[rowA][colsA];
		Thread[] threads = new Thread[rowA];

		// Create and start a thread for each row
		for (int i = 0; i < rowA; i++) {
			threads[i] = new RowMultiplierThread(A, B, result, i);
			threads[i].start();
		}

		// wait for all threads to complete
		for (int i = 0; i < rowA; i++) {
			try {
				threads[i].join();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Result matrix");
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colsB; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
