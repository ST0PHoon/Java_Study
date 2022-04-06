package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P4_9 {

	public static void main(String[] args) {
		Book book1 = new Book("강경학", 10);
		Book book2 = new Book("강민호", 15);
		Book book3 = new Book("강성우", 10);
		Book book4 = new Book("김성표", 20);
		Book book5 = new Book("김응민", 15);

		List<Book> unsortredBooksList = Arrays.asList(book1, book2, book3, book4, book5);

		Comparator<Book> idBookComparator = Comparator.comparing(Book::getId);

		Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);

		Comparator<Book> multipleFieldsComparator = idBookComparator.thenComparing(authorComparator);

		System.out.println("점수 기준 내림차순");

		for (Book book : unsortredBooksList) {
			System.out.println(book);
		}

		Collections.sort(unsortredBooksList, multipleFieldsComparator);

		System.out.println("점수 기준 오름차순");

		for (Book book : unsortredBooksList) {
			System.out.println(book);
		}
	}
}

class Book {

	private int id;
	private String author;


	public Book(String author , int id ) {
		this.id = id;
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "선수 : " + author + ", 점수 : " + id;
	}
}