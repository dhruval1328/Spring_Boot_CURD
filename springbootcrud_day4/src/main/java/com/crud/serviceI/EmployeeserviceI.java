package com.crud.serviceI;

import java.util.List;

import org.springframework.ui.Model;

import com.crud.model.Employee;

public interface EmployeeserviceI {

	void saveEmployee(Employee e);

	public List<Employee> logincheck(String username, String password);

	List<Employee> findByName(String username);

	List<Employee> deleteDataById(int id);

	List<Employee> pagination(int p);

	List<Employee> UpdateData(Employee e);

	Employee EditData(int i);

	
}
