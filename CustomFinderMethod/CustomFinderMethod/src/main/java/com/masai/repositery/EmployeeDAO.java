package com.masai.repositery;

import com.masai.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
    public List<Employee> findByEmpName(String empName);

    public List<Employee> findByDesignation(String desi);

    public List<Employee> findByAddress(String address);

    public List<Employee> findByCompany(String company);

    public List<Employee> findByMobileNum(String mobile);

    public List<Employee> findByEmpNameAndAddress(String name, String address);

    public List<Employee> findByDesignationAndCompany(String desi, String company);
}
