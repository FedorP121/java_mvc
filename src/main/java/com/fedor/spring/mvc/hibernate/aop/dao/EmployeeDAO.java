package com.fedor.spring.mvc.hibernate.aop.dao;

import com.fedor.spring.mvc.hibernate.aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
