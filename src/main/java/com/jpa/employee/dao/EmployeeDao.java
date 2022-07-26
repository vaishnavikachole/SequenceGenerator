package com.jpa.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.employee.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee,String>
{

}
