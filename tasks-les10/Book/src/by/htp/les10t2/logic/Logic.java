package by.htp.les10t2.logic;

import by.htp.les10t2.entity.Book;
import by.htp.les10t2.entity.Library;

import java.util.ArrayList;
import java.util.List;

public class Logic {

	public List<Book> Author(Library library, String author) {

		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getBooks();

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);

			if (book.getAuthor().equals(author)) {
				result.add(books.get(i));
			}
		}
		return result;
	}

	public List<Book> Publisher(Library library, String publisher) {

		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getBooks();

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);

			if (book.getPublisher().equals(publisher)) {
				result.add(books.get(i));
			}
		}
		return result;
	}

	public List<Book> AfterYear(Library library, int year) {

		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getBooks();

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);

			if (book.getYear() > year) {
				result.add(books.get(i));
			}
		}
		return result;
	}
}
