package com.dewlooper.springbootRestApi.business;

import com.dewlooper.springbootRestApi.dal.IEmployeeDal;
import com.dewlooper.springbootRestApi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {


    @Autowired
    private IEmployeeDal employeeDal;


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDal.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDal.saveAndFlush(employee);
    }

    @Override
    public List<Employee> getAllEmployeeList() {
        return employeeDal.findAll();


    }

    @Override
    public Optional<Employee> getEmployee(Long id) {
        return employeeDal.findById(id);
    }


    @Override
    public void deleteEmployee(Long id) {

        employeeDal.deleteById(id);
    }
}
