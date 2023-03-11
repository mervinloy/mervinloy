package busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date date;

	Booking() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus ni: ");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<BusInfo> buses) {
		// TODO Auto-generated method stub
		int capacity = 0;
		for (BusInfo bus : buses) {
			capacity = bus.getCapacity();
		}
		int booked = 0;
		for (Booking b : bookings) {
			if (b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;
	}
}
