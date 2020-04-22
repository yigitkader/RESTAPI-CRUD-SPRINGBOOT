package com.dewlooper.springbootRestApi.controller;


import com.dewlooper.springbootRestApi.business.EmployeeService;
import com.dewlooper.springbootRestApi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/employee")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){

        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){

        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmploye(){

        return employeeService.getAllEmployeeList();
    }

    @GetMapping("/by/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable(name = "employeeId") Long employeeId){

        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/delete/{employeeId}")
    public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId){

        employeeService.deleteEmployee(employeeId);
    }
}
