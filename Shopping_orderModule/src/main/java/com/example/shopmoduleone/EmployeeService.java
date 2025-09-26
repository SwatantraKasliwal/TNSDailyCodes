package com.example.shopmoduleone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Employee employee)
	{
		repo.save(employee);
	}
	
	public Employee get(Long employee_id)
	{
		return repo.findById(employee_id).get();
	}
	public void delete(Long employee_id)
	{
		repo.deleteById(employee_id);
	}
}
