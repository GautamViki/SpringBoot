package org.Assignment.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeptUtility {
    private static EntityManagerFactory emf;
    static {
        emf= Persistence.createEntityManagerFactory("MyUnit1");
    }

    public static EntityManager provideEntityManager() {
        EntityManager em= emf.createEntityManager();
        return em;
    }
}
