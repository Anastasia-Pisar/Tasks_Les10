package by.htp.les10t2.main;

import java.util.List;

import by.htp.les10t2.entity.Book;
import by.htp.les10t2.entity.Library;
import by.htp.les10t2.logic.Logic;
import by.htp.les10t2.view.View;

public class Main {

	public static void main(String[] args) {

		Library l = new Library();
		Logic log = new Logic();
		View v = new View();

		l.add(new Book());
		l.add(new Book(2, "Тень ветра", "Карлос Руис Сафон", "Planeta", 2001, 757, 25, "твердый переплет"));
		l.add(new Book(3, "Игра ангелов", "Карлос Руис Сафон", "Planeta", 2008, 763, 25, "твердый переплет"));
		l.add(new Book(4, "Узник неба", "Карлос Руис Сафон", "Planeta", 2011, 422, 15, "твердый переплет"));
		l.add(new Book(5, "Преступление и наказание", "Федор Михайлович Достоевский", "Русский вестник", 1866, 608, 10,
				"твердый переплет"));
		l.add(new Book(6, "Мастер и Маргарита", "Михаил Афанасьевич Булгаков", "Азбука", 1966, 480, 10,
				"твердый переплет"));
		l.add(new Book(7, "Унесенные веторм", "Маргарет Митчелл", "Иностранка", 1936, 987, 30, "твердый переплет"));

		
		List<Book> res1 =  log.Author(l, "Карлос Руис Сафон");
		v.print("Список книг Карлоса Руиса Сафона: ", res1);
		
		List<Book> res2 = log.Publisher(l, "Русский вестник");
		v.print("Список книг, выпущенных издательством 'Русский вестник': ", res2);
		
		List<Book> res3 = log.AfterYear(l, 1900);
		v.print("Список книг, выпущенных после 1900 года: ", res3);
	}
}
