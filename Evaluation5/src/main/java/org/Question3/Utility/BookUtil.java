package org.Question3.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookUtil {
    private static EntityManagerFactory emf;
    static {
        emf= Persistence.createEntityManagerFactory("Evaluation5");
    }

    public static EntityManager provideEntityManager() {
        EntityManager em= emf.createEntityManager();
        return em;
    }
}
