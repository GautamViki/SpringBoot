package com.masai.controller;

import com.masai.entity.Employee;
import com.masai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee viewEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/")
    public List<Employee> viewAllEmployee() {
        List<Employee> employees = employeeService.getAllEmployee();
        return employees;
    }

    @GetMapping("/name/{name}")
    public List<Employee> viewEmpByName(@PathVariable String name) {
        List<Employee> employees = employeeService.getEmployeeByName(name);
        return employees;
    }

    @GetMapping("/address/{address}")
    public List<Employee> viewByAddress(@PathVariable String address) {
        List<Employee> employees = employeeService.getEmpByAddress(address);
        return employees;
    }

    @GetMapping("/designation/{desi}")
    public List<Employee> viewByDesignation(@PathVariable String desi) {
        List<Employee> employees = employeeService.getEmpByDesignation(desi);
        return employees;
    }

    @GetMapping("/mobile/{mobile}")
    public List<Employee> viewByMobile(@PathVariable String mobile) {
        List<Employee> employees = employeeService.getEmpByMobile(mobile);
        return employees;
    }

    @GetMapping("/nameAddress/{name}/{address}")
    public List<Employee> viewByNameAndAddress(@PathVariable String name, @PathVariable String address) {
        List<Employee> employees = employeeService.getEmpByNameAndAddress(name, address);
        return employees;
    }

    @GetMapping("/desiCompany/{desi}/{comp}")
    public List<Employee> viewByDesignationAndCompany(@PathVariable String desi, @PathVariable String comp) {
        List<Employee> employees = employeeService.getEmpByDesignationAndCompany(desi, comp);
        return employees;
    }
}
