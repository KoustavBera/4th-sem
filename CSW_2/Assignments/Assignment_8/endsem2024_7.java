import java.util.Scanner;

class MyArray {
	int[] arr;
	int size;

	public MyArray(int[] arr, int size) {
		this.arr = arr;
		this.size = size;
	}

	public int[] getArr() {
		return arr;
	}

	public int getsize() {
		return size;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public synchronized void readArr(Scanner sc) {
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public void printArr() {
		synchronized (this) {
			for (int i : arr) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

class ArrayRead extends Thread {
	private MyArray readops;

	public ArrayRead(MyArray readops) {
		this.readops = readops;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		readops.readArr(sc);
	}
}

class ArrayPrint extends Thread {
	private MyArray printops;

	public ArrayPrint(MyArray printops) {
		this.printops = printops;
	}

	public void run() {
		printops.printArr();
	}
}

public class endsem2024_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arr");
		int size = sc.nextInt();
		int[] arr = new int[size];

		MyArray myArray = new MyArray(arr, size);
		ArrayRead arrayRead = new ArrayRead(myArray);
		ArrayPrint arrayPrint = new ArrayPrint(myArray);
		try {
			arrayRead.start();
			arrayRead.join();
			arrayPrint.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sc.close();
	}
}
