package com.dewlooper.springbootRestApi.business;

import com.dewlooper.springbootRestApi.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {


    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployeeList();
    Optional<Employee> getEmployee(Long id);
    void deleteEmployee(Long id);


}