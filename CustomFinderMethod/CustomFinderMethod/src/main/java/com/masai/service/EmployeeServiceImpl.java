package com.masai.service;

import com.masai.entity.Employee;
import com.masai.repositery.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        Optional<Employee> optionalEmployee = employeeDAO.findById(empId);
        Employee employee = optionalEmployee.get();
        if (optionalEmployee.isPresent()) {
            return employee;
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = employeeDAO.findAll();
        if (!employees.isEmpty()) return employees;
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employees = employeeDAO.findByEmpName(name);
        if (!employees.isEmpty()) return employees;
        return null;
    }

    @Override
    public List<Employee> getEmpByDesignation(String desi) {
        List<Employee> employees = employeeDAO.findByDesignation(desi);
        if (!employees.isEmpty()) return employees;
        return null;
    }

    @Override
    public List<Employee> getEmpByAddress(String address) {
        List<Employee> employees = employeeDAO.findByAddress(address);
        if (!employees.isEmpty()) return employees;
        return null;
    }

    @Override
    public List<Employee> getEmpByMobile(String mobile) {
        List<Employee> employees = employeeDAO.findByMobileNum(mobile);
        if (!employees.isEmpty()) return employees;
        return null;
    }

    @Override
    public List<Employee> getEmpByNameAndAddress(String name, String address) {
        List<Employee> employees = employeeDAO.findByEmpNameAndAddress(name, address);
        if (!employees.isEmpty()) return employees;
        return null;
    }

    @Override
    public List<Employee> getEmpByDesignationAndCompany(String desi, String company) {
        List<Employee> employees = employeeDAO.findByDesignationAndCompany(desi, company);
        if (!employees.isEmpty()) return employees;
        return null;
    }
}
