package com.sfm.test;

import com.sfm.dao.BookDao;
import com.sfm.entity.Book;
import com.sfm.helper.SessionFactoryRegistry;

public class MSFTest {
    public static void main(String[] args) {
        BookDao bookDao=null;
        Book book =null;
        try{
            bookDao=new BookDao();
            book=bookDao.getBook(1);

            System.out.println("\n Book "+book);


        }finally {
            SessionFactoryRegistry.closeSessionFactory();
        }

    }
}
