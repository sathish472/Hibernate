package com.sf.test;

import com.sf.dao.BusDao;
import com.sf.entities.Bus;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = null;
        SessionFactory sessionFactory=null;
        try{
            configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            BusDao dao= new BusDao();
            Bus bus=dao.getBus(1, sessionFactory);

            System.out.println("\n bus"+bus);

        }finally {
            if(sessionFactory !=null && sessionFactory.isOpen()){
                sessionFactory.close();
            }
        }



    }
}
