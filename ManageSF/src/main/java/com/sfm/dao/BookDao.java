package com.sfm.dao;

import com.sfm.entity.Book;
import com.sfm.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookDao {
    public Book getBook(int isbnNo) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Book book = null;
        try {
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            System.out.println("\n Session opened.");
            book = session.get(Book.class, isbnNo);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
                System.out.println("\n Session closed.");
            }
        }
        return book;
    }
}
