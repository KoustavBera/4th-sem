
public class p3_BookingExample {

    public static void main(String[] args) {
        SeatBooking booking = new SeatBooking();

        BookingThread t2 = new BookingThread(booking, 6);
        BookingThread t3 = new BookingThread(booking, 3);
        BookingThread t1 = new BookingThread(booking, 4);

        t1.start();
        t2.start();
        t3.start();
    }
}

class SeatBooking {

    int totalSeats = 10;

    public void bookSeats(int seats) {
        synchronized (this) {
            if (seats <= totalSeats) {
                System.out.println(Thread.currentThread().getName() + "booked" + seats + " seats.");
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to book. Not enough seats. ");
            }
        }
    }
}

class BookingThread extends Thread {

    SeatBooking booking;
    int seats;

    public BookingThread(SeatBooking booking, int seats) {
        this.booking = booking;
        this.seats = seats;
    }

    public void run() {
        booking.bookSeats(seats);
    }
}
