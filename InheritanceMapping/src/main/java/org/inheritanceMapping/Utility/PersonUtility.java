package org.inheritanceMapping.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonUtility {
    private static EntityManagerFactory emf;
    static {
        emf=Persistence.createEntityManagerFactory("unit");
    }

    public static EntityManager provideEntityManager() {
        EntityManager em= emf.createEntityManager();
        return em;
    }
}
