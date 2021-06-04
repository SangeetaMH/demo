package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.Employerepository;
@Transactional
@Service
public class Employeeserviceimpl  {
	@Autowired
	private Employerepository repo;
	public Employee addEmployee(Employee emp) throws Invaidsalary, Invaliddesignation
	{
	if(emp.getDesignation()=="manager")
	{
		
		if(emp.getSalary()>1000000)
		{
			throw new Invaidsalary("add salary below than this");
		}
	}
	else if(emp.getDesignation()=="sr softwareengineer")
	{
		if(emp.getSalary()>50000)
		{
			throw new Invaidsalary("add salary below than this");
		}
	}
	else if(emp.getDesignation()=="software engineer")
	{
		if(emp.getSalary()<30000 || emp.getSalary()>50000)
		{
			throw new Invaidsalary("add new Salary below than this");
		}
	}
	else if(emp.getDesignation()=="trainee"){
		if(emp.getSalary()<20000 || emp.getSalary()>30000)
		{
			throw new Invaidsalary("add new salary than this");
		}
	}
		else {
			throw new Invaliddesignation("add correct designation");
			
		}
	
	   return repo.save(emp);
	}

		
		
	
	

	
	
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//  @Override
//	public Employee addEmployee(Employee emp) {
//	
//	   return repo.save(emp);
//	}
//
//	@Override
//	public List<Employee> getemployee() {
//		return repo.findAll();
//	}
//
//	@Override
//	public Employee updateEmployee(Employee emp, String name) {
//		Employee existingEmployee=repo.findByName(name);
//		//System.out.println( existingEmployee);
//		existingEmployee.setAge(emp.getAge());
//		existingEmployee.setDepartment(emp.getDepartment());
//		return repo.save(existingEmployee);
//		}
////		@Override
////	public void deleteEmployee(String name) {
////		
////		   Employee r=repo.findByName(name);
////		//   System.out.println(r+" ");
////		   
////		   repo.delete(r);
////		
////	}
//		@Override
//	public void deleteEmployee(int  id) {
//		 repo.deleteById(id);		
//	}
//
//	@Override
//	public Employee getbyid(int id) {
//	return repo.findById(id).orElse(null);
//	}
//
//	@Override
//	public Employee updateEmployee(Employee emp, int id) {
//		Employee exsitingProduct = repo.findById(id).get();
//		exsitingProduct.setName(emp.getName());
//		exsitingProduct.setAge(emp.getAge());
//		 return repo.save(exsitingProduct);
//		
//	}

	

























////create
//public Employee addEmployee(Employee emp)
//{
//	return repo.save(emp);
//}
////read
//public List<Employee> getemployee()
//{
//	return repo.findAll();
//	
//}
//public Employee updateEmployee(Employee emp,String name)
//{
//	Employee existingEmployee=repo.findByName(name);
//	existingEmployee.setAge(emp.getAge());
//	existingEmployee.setDepartment(emp.getDepartment());
//	return repo.save(existingEmployee);
//}
//	
//
//public void deleteEmployee(Integer id)
//{
//    repo.deleteById(id);
//}