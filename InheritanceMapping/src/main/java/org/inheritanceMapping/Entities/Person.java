package org.inheritanceMapping.Entities;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
abstract class  Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String name;

    public Person(){

    }

    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
