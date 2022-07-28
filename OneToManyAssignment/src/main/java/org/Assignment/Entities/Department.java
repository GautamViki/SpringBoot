package org.Assignment.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int deptId;
    private String dname;
    private String location;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Employee> emp=new ArrayList<>();

    public Department(){}

    public Department(int deptId, String dname, String location, List<Employee> emp) {
        this.deptId = deptId;
        this.dname = dname;
        this.location = location;
        this.emp = emp;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }
}
