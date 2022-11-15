package com.masai.service;

import com.masai.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    public Employee getEmployeeById(Integer empId);

    public List<Employee> getAllEmployee();

    public List<Employee> getEmployeeByName(String name);

    public List<Employee> getEmpByDesignation(String desi);

    public List<Employee> getEmpByAddress(String address);

    public List<Employee> getEmpByMobile(String mobile);

    public List<Employee> getEmpByNameAndAddress(String name, String address);

    public List<Employee> getEmpByDesignationAndCompany(String desi, String company);


}
