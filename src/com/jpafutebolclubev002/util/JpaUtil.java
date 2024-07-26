package com.jpafutebolclubev002.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leandro
 */
public class JpaUtil {
    private static final EntityManagerFactory emf;
    
    static {
        emf = Persistence.createEntityManagerFactory("JpaFutebolClubeV002PU");
    }
    
    public static EntityManager openConnection() {
        return emf.createEntityManager();
    }
    
    public static void closeConnectiton() {
        emf.close();
    }
}
