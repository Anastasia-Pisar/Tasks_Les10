package by.htp.les10t.main;

import by.htp.les10t.entity.Customer;
import by.htp.les10t.entity.CustomerBook;
import by.htp.les10t.logic.Logic;
import by.htp.les10t.view.View;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		CustomerBook cb = new CustomerBook();
		Logic logic = new Logic();
		View view = new View();
		
		
		cb.add(new Customer());
		cb.add(new Customer(2, "Иванов Иван Иванович", "Россия, Москва", 123, 2));
		cb.add(new Customer(3, "Петров Петр Петрович", "Беларусь, Минск", 234,3));
		
		List<Customer> res1;
		res1 = logic.alphabetSorted(cb);
		view.print("Список покупателей в алфавитном порядке: ",  res1);
		
		List<Customer> res2;
		res2 = logic.interval(cb, 1, 222);
		view.print("Список покупателей, у которых номер кредитной карты  находится в интервале [1, 222] :", res2);
	}
}
