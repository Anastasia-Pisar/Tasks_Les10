package by.htp.les10t3.view;

import by.htp.les10t3.entity.Airline;

import java.util.List;

public class View {

	public void print(String message, List<Airline> airlines) {
		
		System.out.println("------------------");
		System.out.println(message);
		System.out.println("------------------");

		for (int i = 0; i < airlines.size(); i++) {
			Airline airline = airlines.get(i);

			System.out.println(airline.toString());
		}
	}
}