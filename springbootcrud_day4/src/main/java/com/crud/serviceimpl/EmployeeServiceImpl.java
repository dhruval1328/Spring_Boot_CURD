package com.crud.serviceimpl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.crud.model.Employee;
import com.crud.repositoryI.EmployeeRepository;
import com.crud.serviceI.EmployeeserviceI;

@Service
public class EmployeeServiceImpl  implements EmployeeserviceI{

	@Autowired
	EmployeeRepository er;
	
	@Override
	public void saveEmployee(Employee e) {
		
		er.save(e);
		
	}
	
	@Override
	public List<Employee> findByName(String username){
		List<Employee> l = er.getDataByName(username);
		return l;
	}
	
	@Override
	public List<Employee> deleteDataById(int id){
		er.deleteDataById(id);
		return (List<Employee>) er.findAll();
	}

	@Override
	public List<Employee> logincheck(String username, String password) {
		
		if(username.equals("Admin")&&password.equals("123")) {
		List<Employee> l =	(List<Employee>) er.findAll();
			return l;
		}else {
		List<Employee> l1 = er.getByUsernameAndPassword(username, password);
		return l1;
		}
	}

	@Override
	public List<Employee> pagination(int p) {
	  Pageable pa = PageRequest.of(p, 2,Sort.by("name").ascending());
		return er.findAll(pa).toList();
	}


	@Override
	public Employee EditData(int i) {
		Employee e= er.findById(i);
		return e;
	}

	@Override
	public List<Employee> UpdateData(Employee e) {
		er.save(e);
		return er.findAll();
	}


	

}
