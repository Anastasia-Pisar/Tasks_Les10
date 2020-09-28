package by.htp.les10t.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerBook {
	private List<Customer> customers;

	public CustomerBook() {
		customers = new ArrayList<Customer>();
	}

	public CustomerBook(Customer[] customers) {
		this.customers = new ArrayList<Customer>();
		for (int i = 0; i < customers.length; i++) {
			this.customers.add(customers[i]);
		}
	}
	
	public boolean add(Customer customer) {
		return customers.add(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
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
		CustomerBook other = (CustomerBook) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerBook [customers = " + customers + "]";
	}
	
}
