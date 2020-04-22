package com.dewlooper.springbootRestApi.dal;

import com.dewlooper.springbootRestApi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeDal extends JpaRepository<Employee,Long> {
}
