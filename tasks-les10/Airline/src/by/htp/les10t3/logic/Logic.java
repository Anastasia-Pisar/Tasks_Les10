package by.htp.les10t3.logic;

import by.htp.les10t3.entity.Airline;
import by.htp.les10t3.entity.Airport;

import java.util.ArrayList;
import java.util.List;

public class Logic {

	public List<Airline> flightsToDestination(Airport airport, String destination) {
		
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();

		for (int i = 0; i < airlines.size(); i++) {
			Airline air = airlines.get(i);

			if (air.getDestination().equals(destination)) {
				result.add(air);
			}
		}
		return result;
	}

	public List<Airline> flightsForTheDay(Airport airport, String day) {
		
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();

		for (int i = 0; i < airlines.size(); i++) {
			Airline air = airlines.get(i);

			if (air.getDay().equals(day)) {
				result.add(air);
			}
		}
		return result;
	}

	public List<Airline> afterTime(Airport airport, int time) {
		
		List<Airline> result = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();

		for (int i = 0; i < airlines.size(); i++) {
			Airline air = airlines.get(i);

			if (air.getDepartureTime() > time) {
				result.add(air);
			}
		}
		return result;
	}

	public List<Airline> DayAndTime(Airport airport, String day, int time) {
		
		List<Airline> result1 = new ArrayList<Airline>();
		List<Airline> result2 = new ArrayList<Airline>();
		List<Airline> airlines = airport.getAirlines();

		for (int i = 0; i < airlines.size(); i++) {
			Airline air = airlines.get(i);

			if (air.getDay().equals(day)) {
				result1.add(air);
			}
		}

		for (int i = 0; i < result1.size(); i++) {
			Airline air = result1.get(i);

			if (air.getDepartureTime() > time) {
				result2.add(air);
			}
		}
		return result2;
	}
}
