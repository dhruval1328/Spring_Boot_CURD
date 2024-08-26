package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.model.Employee;

import com.crud.serviceI.EmployeeserviceI;

@Controller
public class HomeController {
	
	@Autowired 
	
	EmployeeserviceI esi;
	
	@RequestMapping("/")
	public String log() {
		return "Login";
	}
	
	@RequestMapping("/reg")
	public String reg() {
		return "Register";
	}
	
	@RequestMapping("/register")
	public String saveEmployee(@ModelAttribute Employee e) {
		esi.saveEmployee(e);
		return "Login";
	}
		
	@RequestMapping("/log")
	public String getall(@RequestParam("username") String u,@RequestParam("password") String p,Model m){
		
//		List<Employee> l = esi.findByName(u);
//	
//		m.addAttribute("data", l);
		List<Employee> l1 = esi.logincheck(u, p);
		m.addAttribute("data", l1);
		return "Success";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("id") int i,Model m) {
		List<Employee> l = esi.deleteDataById(i);
		m.addAttribute("data", l);
		return "Success";
	}
	
	@RequestMapping("/paging")
	public String pagination(@RequestParam("page") int p, Model m) {
		List<Employee> l = esi.pagination(p);
		m.addAttribute("data", l);
		return "Success";
	}
	
	@RequestMapping("/edit")
	public String EditData(@RequestParam("id") int i,Model m) {
	Employee e = esi.EditData(i);
		m.addAttribute("stu", e);
		return "Update";
	}
	@RequestMapping("/update")
	public String UpdateData(@ModelAttribute Employee e,Model m) {
	List<Employee> l = esi.UpdateData(e);
		m.addAttribute("data", l);
		return "Success";
	}
	
}
