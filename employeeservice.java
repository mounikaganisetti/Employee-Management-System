package springboot.employeecruddemo.service;

import java.util.List;

import springboot.employeecruddemo.model.Employee;

public interface employeeservice {
		public String addemp(Employee e);
		public List<Employee> getemployees();
		public Employee updateemp(Employee e,int eid);
		public String deleteemp(int Id);
		

	}


