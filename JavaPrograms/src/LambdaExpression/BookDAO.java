package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(10, "Java", 100));
		bookList.add(new Book(40, "Hibernate", 50));
		bookList.add(new Book(30, "AWS", 40));
		bookList.add(new Book(20, "GCP", 60));
		return bookList;
	}

}
