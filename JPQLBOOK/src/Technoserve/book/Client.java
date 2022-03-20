package Technoserve.book;

import java.text.ParseException;

import javax.persistence.Entity;
import javax.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Id;

import Technoserve.book.entity.Book;
import Technoserve.book.service.BookService;
import Technoserve.book.service.BookServiceImpl;

public class Client
{
	public static void main(String[] args) throws ParseException
	{	
		
		Book book= new Book();
		BookService service = new BookServiceImpl();
		book.setId(110);
		book.setTitle("Apple");
		book.setAuthor("Ronald");
		book.setPrice(500);
		service.addbook(book);
		//System.out.println(book);
		System.out.println(service.getcount());
		System.out.println(service.getBookInPriceRange(500,600));
	}
	
}
