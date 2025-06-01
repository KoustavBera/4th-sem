import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the max limit and the number of threads");
		int limit = sc.nextInt(), nothreads = sc.nextInt();

		int start = 0;
		int end = 0;
		int range = limit / nothreads;

		for (int i = 0; i < nothreads; i++) {
			end = (i == nothreads - 1) ? limit : start + range - 1;
			Thread t = new PrimeThread(start, end);
			t.start();
			start = end + 1;
		}
		sc.close();
	}

}

class PrimeThread extends Thread {
	int start, end;

	public PrimeThread(int s, int e) {
		start = s;
		end = e;
	}

	public boolean isPrime(int candidate) {
		for (int i = 2; i <= Math.sqrt(candidate); i++) {
			if (candidate % i == 0)
				return false;
		}
		return true;
	}

	public void run() {
		synchronized (this) {
			System.out.println("Thread " + getName() + " is generating prime numbers from " + start + " to " + end);

			for (int i = start; i <= end; i++) {
				if (isPrime(i)) {
					System.out.println("Thread " + getName() + " found prime:" + i);
				}
			}
		}
	}

}
