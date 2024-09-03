package com.hb3.test;


import com.hb3.entites.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropsHb3Bootstrapping {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        //deafult constrcutor looks for hibernate.properties

        configuration.addResource("com/hb3/entities/Passport.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Passport passport = session.get(Passport.class, 1);
            System.out.println(passport);

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            if (sessionFactory != null && sessionFactory.isOpen()) {
                sessionFactory.close();
            }

        }
    }
}
