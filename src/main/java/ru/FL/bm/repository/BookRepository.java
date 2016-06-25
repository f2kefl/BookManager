package ru.FL.bm.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.FL.bm.domain.Book;

import java.util.List;

/*

 */

@Repository
@Transactional
public class BookRepository
{
    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(Book book)
    {
        sessionFactory.getCurrentSession().save(book);
    }

    public List listAll()
    {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    public void removeBook(Integer iD)
    {
        Book book = (Book) sessionFactory.getCurrentSession().load(Book.class, iD);
        if (null != book) {
            sessionFactory.getCurrentSession().delete(book);
        }
    }
}

