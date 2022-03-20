package Technoserve.book.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Technoserve.book.entity.Book;


public class BookDaoImpl implements BookDao
{
	EntityManager em;
	public BookDaoImpl()
	{
		em = Configuration.createEntityManager();	
	}

	@Override
	public void addBook(Book b)
	{
		em.persist(b);
	}

	@Override
	public void startTransaction() 
	{		
		em.getTransaction().begin();;
	}

	@Override
	public void endTransaction() 
	{
		em.getTransaction().commit();
	}
	@Override
	public Long getcount() 
	{
		String query="Select COUNT(b.id)from Book b";
		TypedQuery<Long> t=em.createQuery(query,Long.class);
		Long count = t.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBookInPriceRange(int i, int j) {
		String query="Select b from Book b where b.getBookInPriceRange between : price1 and price2";
		TypedQuery<Book> t=em.createQuery(query,Book.class);
		t.setParameter("price1", i);
		t.setParameter("price2", j);
		List<Book> list=t.getResultList();
		return list;
		
	}
}
