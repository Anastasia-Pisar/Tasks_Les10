package by.htp.les10t.logic;

import by.htp.les10t.entity.Customer;
import by.htp.les10t.entity.CustomerBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Logic {
	
	public List<Customer> alphabetSorted(CustomerBook customerBook) {		
		List<Customer> customers = customerBook.getCustomers();
		
		Collections.sort(customers, new Comparator<Customer>() {
			
			public int compare(Customer o1, Customer o2) {
				return o1.getFullName().compareTo(o2.getFullName());
			}
		});
		return customers;
	}

	public List<Customer> interval(CustomerBook customerBook, int min, int max) {
		List<Customer> result = new ArrayList<Customer>();

		List<Customer> customers;
		customers = customerBook.getCustomers();

		for (int i = 0; i < customers.size(); i++) {

			if ((customers.get(i).getCreditCardNumber() >= min) && (customers.get(i).getCreditCardNumber() <= max)) {
				result.add(customers.get(i));
			}
		}
		return result;
	}
}
