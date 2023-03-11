package busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusMainDetails {
	public static void main(String args[]) {
		ArrayList<BusInfo> buses = new ArrayList<BusInfo>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new BusInfo(1, true, 2));
		buses.add(new BusInfo(2, false, 50));
		buses.add(new BusInfo(3, true, 48));

		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		for (BusInfo b : buses) {
			b.displayBus();
		}
		while (userOpt == 1) {
			System.out.println("Enter 1 to book and 2 to exit ");
			userOpt = scanner.nextInt();
			if (userOpt == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				} else
					System.out.println("Sorry,Bus is full. Try  another date or bus.");
			}
		}
	}
}
