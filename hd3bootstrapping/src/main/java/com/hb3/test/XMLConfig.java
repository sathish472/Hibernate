package com.hb3.test;

import com.hb3.entites.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XMLConfig {
    public static void main(String[] args) {
       Configuration configuration=new Configuration()
               .configure("com/hb3/config/hb3-hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        try{
            Passport passport = session.get(Passport.class, 1);
            System.out.println("\n passport "+passport);


        }finally {
            if(session!=null && session.isOpen()){
                session.close();
            }
            if(sessionFactory !=null && sessionFactory.isOpen()){
                sessionFactory.close();
            }
        }

    }
}
