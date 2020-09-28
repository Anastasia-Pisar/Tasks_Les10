package by.htp.les10t3.entity;

public class Airline {

	private String destination;
	private int flightNumber;
	private String planeType;
	private int departureTime;
	private String day;

	public Airline() {

		this.destination = "Minsk";
		this.flightNumber = 98;
		this.planeType = "Passenger type";
		this.departureTime = 10;
		this.day = "Mon, Tue, Wed, Thu, Fri";
	}

	public Airline(String destination, int flightNumber, String planeType, int departureTime, String day) {

		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.day = day;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + departureTime;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((planeType == null) ? 0 : planeType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (departureTime != other.departureTime)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (planeType == null) {
			if (other.planeType != null)
				return false;
		} else if (!planeType.equals(other.planeType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination = " + destination + ", flightNumber = " + flightNumber + ", planeType = "
				+ planeType + ", departureTime = " + departureTime + ", day = " + day + "]";
	}
}
