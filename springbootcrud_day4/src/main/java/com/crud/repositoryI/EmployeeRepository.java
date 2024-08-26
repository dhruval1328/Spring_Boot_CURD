package com.crud.repositoryI;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
//	@Query(value = "select * from Employee where username=:username && password=:password", nativeQuery =true)
	List<Employee> getByUsernameAndPassword(String username,String password);
	
	@Query(value="select * from Employee where username=:username", nativeQuery =true)
	List<Employee> getDataByName(String username);
	
	@Modifying
	@Transactional
	@Query("delete from Employee where id=:id")
	void deleteDataById(int id);

	public Employee findById(int i);
	
	
	
	
}
