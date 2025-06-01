class Buffer {
	private int[] buffer;
	private int count = 0;
	private final int capacity;

	public Buffer(int size) {
		buffer = new int[size];
		capacity = size;
	}

	public synchronized void put(int value) throws InterruptedException {
		while (count == capacity) {
			System.out.println("Buffer full. Producer is waiting...");
			wait();
		}

		buffer[count++] = value;
		System.out.println("Produced: " + value);
		notify();
	}

	public synchronized int get() throws InterruptedException {
		while (count == 0) {
			System.out.println("Buffer empty. Consumer is waiting...");
			wait();
		}

		int value = buffer[--count];
		System.out.println("Consumed: " + value);
		notify();
		return value;
	}
}

class Producer extends Thread {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				buffer.put(i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Producer finished producing");
	}
}

class Consumer extends Thread {
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				buffer.get();
				Thread.sleep(800);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Consumer finished consuming.");
	}
}

public class q8 {
	public static void main(String[] args) {
		Buffer buffer = new Buffer(3);
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);

		producer.start();
		consumer.start();
	}
}
