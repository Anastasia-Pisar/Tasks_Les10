package by.htp.les10t3.main;

import java.util.List;

import by.htp.les10t3.entity.Airline;
import by.htp.les10t3.entity.Airport;
import by.htp.les10t3.logic.Logic;
import by.htp.les10t3.view.View;

public class Main {

	public static void main(String[] args) {

		Airport air = new Airport();
		Logic log = new Logic();
		View v = new View();

		air.add(new Airline());
		air.add(new Airline("Mockow", 537, "Passenger type", 9, "Mon"));
		air.add(new Airline("Mockow", 538, "Passenger type", 12, "Tue"));
		air.add(new Airline("Mockow", 539, "Passenger type", 17, "Wed"));
		air.add(new Airline("Kiev", 19, "Passenger type", 5, "Wed"));
		air.add(new Airline("Kiev", 20, "Passenger type", 10, "Thu"));
		air.add(new Airline("Kiev", 21, "Passenger type", 14, "Fri"));
		air.add(new Airline("Vienna", 333, "Passenger type", 10, "Mon"));
		air.add(new Airline("Vienna", 334, "Passenger type", 15, "Wed"));
		air.add(new Airline("Vienna", 335, "Passenger type", 19, "Fri"));
		air.add(new Airline("London", 500, "Passenger type", 19, "Wed"));
		air.add(new Airline("London", 501, "Passenger type", 7, "Fri"));

		List<Airline> res1 = log.flightsToDestination(air, "Vienna");
		v.print("Flights to Vienna : ", res1);
		
		List<Airline> res2 = log.flightsForTheDay(air, "Fri");
		v.print("Flights on Friday: ", res2);
		
		List<Airline> res3 = log.DayAndTime(air, "Wed", 12);
		v.print("Flights departure on Wednesday after 12: ", res3);
	}
}
