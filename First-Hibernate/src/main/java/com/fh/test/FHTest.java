package com.fh.test;

import com.fh.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FHTest {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure();
        Session session = null;
        Product product = null;
        SessionFactory sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
        product = session.get(Product.class, 1);
        System.out.println(product);
        System.out.println("\n Done");

    }
}
