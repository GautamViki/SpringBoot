package org.inheritanceMapping.Entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Employee extends Person {
    @Embedded
    private Address homeAddress;
    @Embedded
    private Address officeAddress;
    private int salary;

    public Employee(){

    }

    public Employee(Address homeAddress, Address officeAddress, int salary) {
        this.homeAddress = homeAddress;
        this.officeAddress = officeAddress;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }
}
