package com.jpaconfig.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryRegistry {
    private static EntityManagerFactory entityManagerFactory;

    static {
        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("hibpu");
        }catch (Throwable t){
            t.printStackTrace();
            throw  t;
        }
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }

    public static void closeEntityManagerFacory(){
        if(entityManagerFactory!=null && entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
    
}
