package by.htp.les10t2.view;

import by.htp.les10t2.entity.Book;

import java.util.List;

public class View {

	public void print(String message, List<Book> books) {
		
		System.out.println("------------------");
		System.out.println(message);
		System.out.println("------------------");

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);

			System.out.println(book.toString());
		}
	}
}
