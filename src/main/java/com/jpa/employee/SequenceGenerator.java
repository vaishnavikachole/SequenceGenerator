package com.jpa.employee;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.employee.dao.EmployeeDao;
import com.jpa.employee.entities.Employee;

@SpringBootApplication
public class SequenceGenerator  {

	
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(SequenceGenerator.class, args);
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
		Employee employee = new Employee();
		
		employee.setFirstName("shivani");
		employee.setLastName("shrivastav");
		employee.setEmail("shivani@gmail.com");
		employee.setCreationDate(new Date());
		
		Employee savedEntity= employeeDao.save(employee);
		System.out.println(savedEntity);
		context.close();
		
	
	
	}
	

}
