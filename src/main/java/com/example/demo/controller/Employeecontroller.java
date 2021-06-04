package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Employeeserviceimpl;
import com.example.demo.service.Invaidsalary;
import com.example.demo.service.Invaliddesignation;
import com.example.demo.service.invalidDataException;

@RestController
public class Employeecontroller {
	@Autowired
	private Employeeserviceimpl service;
	@PostMapping("/addemployee")
	private Employee addEmployeedetails(@RequestBody Employee emp) throws Invaidsalary, Invaliddesignation
	{
		System.out.println("hii");
		return service.addEmployee(emp);
	}
//	@GetMapping("")
//	private List<Employee> getEmployedetails()
//	{
//		return service.getemployee();
//		
//	}
//	@PutMapping("/update/{name}")
//	private void updateEmployeedetails(@RequestBody Employee emp,@PathVariable String name)
//	{
//		service.updateEmployee(emp, name);
//	}
//  
////	@DeleteMapping("{name}")
////	private void deleteEmployeedetails(@PathVariable String name)
////	{
////		service.deleteEmployee(name);
////	}
//   @GetMapping("{id}")
//   private Employee getEmployeebyid(@PathVariable int id)
//   {
//	  return service.getbyid(id);
//   }
//  @PutMapping("{id}")
//  private Employee updateEmployeebyid(@RequestBody Employee emp,@PathVariable int id)
//  {
//	return service.updateEmployee(emp, id);
//	  
//  }
//  @DeleteMapping("{id}")
//  private void deleteEmployeedetails(@PathVariable int id)
//  {
//	   service.deleteEmployee(id);
//  }
//   
   
}












