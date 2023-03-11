package busReservation;

public class BusInfo {

	private int busNo;
	private boolean ac;
	private int capacity;

	BusInfo(int no, boolean ac, int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void displayBus() {
		System.out.println("Bus no:" + busNo + "Ac:" + ac + "Total capacity:" + capacity);

	}
}
