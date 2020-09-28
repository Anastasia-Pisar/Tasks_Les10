package by.htp.les10t.view;

import java.util.List;

import by.htp.les10t.entity.*;

public class View {

	public void print(String message, List<Customer> customers) {
		System.out.println("-----------");
		System.out.println(message);
		System.out.println("-----------");

		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);

			System.out.println(c.toString());
		}
	}
}
