package com.sf.dao;

import com.sf.entities.Bus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BusDao {

    public Bus getBus(int busno, SessionFactory sessionFactory) {
        Bus bus = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            bus = session.get(Bus.class, 1);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return bus;
    }
}
