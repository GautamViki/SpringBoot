package org.Assignment.Main;

import org.Assignment.Entities.Department;
import org.Assignment.Entities.Employee;
import org.Assignment.Utility.DeptUtility;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {

        EntityManager em= DeptUtility.provideEntityManager();
        Department dept=new Department();
        dept.setDname("HR");
        dept.setLocation("Kolkata");

        Department dept1=new Department();
        dept1.setDname("Computer");
        dept1.setLocation("Hydrabad");

        Employee emp1=new Employee();
        emp1.setEname("ram");
        emp1.setSalary(8500);
        emp1.setAddress("Lucknow");
        emp1.setDept(dept);

        Employee emp2=new Employee();
        emp2.setEname("ramesh");
        emp2.setSalary(7500);
        emp2.setAddress("Pune");
        emp2.setDept(dept1);

        Employee emp3=new Employee();
        emp3.setEname("Vikas");
        emp3.setSalary(10000);
        emp3.setAddress("Bengaluru");
        emp3.setDept(dept);

        Employee emp4=new Employee();
        emp4.setEname("Anshul");
        emp4.setSalary(9000);
        emp4.setAddress("Bihar");
        emp4.setDept(dept1);



        dept.getEmp().add(emp1);
        dept.getEmp().add(emp2);
        dept1.getEmp().add(emp3);
        dept1.getEmp().add(emp4);



        em.getTransaction().begin();

        em.persist(emp1);
        em.persist(emp2);
        em.persist(emp3);
        em.persist(emp4);
        em.persist(dept);
        em.persist(dept1);

        em.getTransaction().commit();

        em.close();

        System.out.println("done...");

    }
}
