import java.util.Scanner;

class SeatBooking {
	int availableSeats;

	public SeatBooking(int x) {
		availableSeats = x;
	}

	public void seatsToBook(String user, int seatstobook) {

		synchronized (this) {
			System.out.println(user + " is trying to book " + seatstobook + " seat(s)");

			if (availableSeats >= seatstobook) {
				System.out.println(user + " successfully booked " + seatstobook + " seat(s) ");
				availableSeats -= seatstobook;
				System.out.println("Available seat(s): " + availableSeats);
			} else {
				System.out.println(user + " failed to book seats. House full!");
			}
		}
	}
}

class BookingThread extends Thread {
	SeatBooking bookingSystem;
	String user;
	int seatstobook;

	public BookingThread(SeatBooking bookingSystem, String user, int seatsToBook) {
		this.user = user;
		this.bookingSystem = bookingSystem;
		this.seatstobook = seatsToBook;
	}

	public void run() {
		bookingSystem.seatsToBook(user, seatstobook);
	}
}

public class q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter available seats");
		int availableSeats = sc.nextInt();
		SeatBooking bookingSystem = new SeatBooking(availableSeats);

		// multiple users
		BookingThread user1 = new BookingThread(bookingSystem, "Tanishq", 6);
		BookingThread user2 = new BookingThread(bookingSystem, "Koustav", 4);
		BookingThread user3 = new BookingThread(bookingSystem, "Swetanjana", 6);

		user1.start();
		user2.start();
		user3.start();

	}
}
