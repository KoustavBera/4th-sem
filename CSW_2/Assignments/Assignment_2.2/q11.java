import java.util.PriorityQueue;

public class q11 {
	public static void main(String[] args) {
		// Declare the array of integers
		int[] arr = { 1, 2, 10, 8, 7, 3, 4, 6, 5, 9 };

		// Create a min-heap using PriorityQueue
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		// Add all elements from the array to the min-heap
		for (int num : arr) {
			minHeap.add(num);
		}

		// Dequeue elements from the min-heap and print them
		System.out.println("Elements in ascending order (min-heap order):");
		while (!minHeap.isEmpty()) {
			System.out.print(minHeap.poll() + " ");
		}
	}
}