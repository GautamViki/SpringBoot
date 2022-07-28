package org.inheritanceMapping;

import org.inheritanceMapping.Entities.Address;
import org.inheritanceMapping.Entities.Employee;
import org.inheritanceMapping.Utility.PersonUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManager em= PersonUtility.provideEntityManager();
        Employee emp=new Employee();
        emp.setName("Vikas");
        emp.setSalary(2000);
        emp.setHomeAddress(new Address("UP","Kanpur","12548"));
        emp.setOfficeAddress(new Address("Karnataka","Bengaluru","560040"));

        try {
            em.getTransaction().begin();
//            em.persist(emp.getHomeAddress());
//            em.persist(emp.getOfficeAddress());
            em.persist(emp);
            em.getTransaction().commit();
            System.out.println("done...........");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}