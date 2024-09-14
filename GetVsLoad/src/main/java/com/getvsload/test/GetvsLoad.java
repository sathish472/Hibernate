package com.getvsload.test;


import com.getvsload.entities.Customer;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetvsLoad {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            useOfFinalTunrsofLazyLoading(session);
        } finally {
            if (sessionFactory.isOpen()) {
                sessionFactory.close();
            }
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    public static void eagerVsLazy(Session session) {
        // Customer customer = session.get(Customer.class, 1);
        //System.out.println(customer.getClass().getCanonicalName());
        //System.out.println("\n Customer: " + customer);

        Customer customer1 = session.load(Customer.class, 1);

        System.out.println(customer1);
    }

    private static void noRecordExists(Session session) {
        Customer customer = session.get(Customer.class, 2);
        System.out.println(customer);

        Customer customer2 = session.load(Customer.class, 2);
        if (customer2 != null) {
            System.out.println("\n Object Found");
        } else {
            System.out.println("\n Object not found");
        }

        System.out.println(customer2.getFullname());
    }

    private static void safaOperation(Session session) {
        Customer customer = session.get(Customer.class, 2);

       /* if(customer!=null){
            System.out.println(customer.getFullname());
        }else{
            System.out.println("No customer found");
        }*/


        try {
            Customer customer1 = session.load(Customer.class, 2);
            System.out.println("\n " + customer1.getFullname());
        } catch (ObjectNotFoundException ex) {
            ex.printStackTrace();
        }


    }

    public static void activeSession(Session session) {
        //Customer customer1 = session.get(Customer.class,1);
        Customer customer1 = session.load(Customer.class, 1);
        session.close();
        System.out.println("Session closed");
        System.out.println("\n FullName:" + customer1.getFullname());
    }

    public static void defaultToLazyButCanTurnOff(Session session) {
        Customer customer2 = session.load(Customer.class, 1);

        // add lazy="fasle" in hbm file, @Lazy annoatation in calss level
    }

    public static void useOfFinalTunrsofLazyLoading(Session session) {
        Customer customer2 = session.load(Customer.class, 1);
        //If the class is final then does not support lazy loading, but if we provies proxy supoorts laxy loading.
        //add proxy="ICstmer" in hbm file
        //use ICustomer customer=ssession.load(Customer.class,1);

        System.out.println("\n supports lazy loading and will not query on calling load");
        System.out.println("now trying to access the data" + customer2.getEmailAddress());

    }


}
