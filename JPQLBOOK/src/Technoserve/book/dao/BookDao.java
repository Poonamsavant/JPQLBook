package Technoserve.book.dao;

import java.util.List;

import Technoserve.book.entity.Book;

public interface BookDao
{
	public void addBook(Book b);
	 void startTransaction();
	 void endTransaction();
	public Long getcount();
	public List<Book> getBookInPriceRange(int i, int j);
	//public List<Book> getBookInPriceRange(int i, int j);

}
