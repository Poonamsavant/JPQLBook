package Technoserve.book.service;

import java.util.List;

import Technoserve.book.dao.BookDao;
import Technoserve.book.dao.BookDaoImpl;
//import Technoserve.book.dao.BookServiceImpl;
import Technoserve.book.entity.Book;

public class BookServiceImpl implements BookService 
{
	BookDao bd;
	public BookServiceImpl()
	{
		bd=new BookDaoImpl();

	}
	@Override
	public void addbook(Book b) 
	{
		bd.startTransaction();
		bd.addBook(b);
		bd.endTransaction();
	}
	@Override
	public long getcount() 
	{
		
		return bd.getcount();
	}
	@Override
	public List<Book> getBookInPriceRange(int i, int j) {
		List<Book> list = bd.getBookInPriceRange(i,j);
		return list;
	}

}
