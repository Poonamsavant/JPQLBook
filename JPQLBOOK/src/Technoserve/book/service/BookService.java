package Technoserve.book.service;

import java.util.List;

import Technoserve.book.entity.Book;

public interface BookService {

	//void addbook(Book book);

	//void addBook(Book book);

	void addbook(Book b);

	 public long getcount();

	public List<Book> getBookInPriceRange(int i, int j);



}
