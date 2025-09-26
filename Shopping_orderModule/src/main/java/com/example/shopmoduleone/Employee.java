package com.example.shopmoduleone;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employee_id;
	private String employee_name;
	private LocalDate employee_dob;
	private Float employee_salary;
	private String employee_address;
	private String employee_designation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Shop employee_shopid;
	
	
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public LocalDate getEmployee_dob() {
		return employee_dob;
	}
	public void setEmployee_dob(LocalDate employee_dob) {
		this.employee_dob = employee_dob;
	}
	public Float getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(Float employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public Shop getEmployee_shopid() {
		return employee_shopid;
	}
	public void setEmployee_shopid(Shop employee_shopid) {
		this.employee_shopid = employee_shopid;
	}
	
	
	public Employee(Long employee_id, String employee_name, LocalDate employee_dob, Float employee_salary,
			String employee_address, String employee_designation, Shop employee_shopid) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_dob = employee_dob;
		this.employee_salary = employee_salary;
		this.employee_address = employee_address;
		this.employee_designation = employee_designation;
		this.employee_shopid = employee_shopid;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_dob="
				+ employee_dob + ", employee_salary=" + employee_salary + ", employee_address=" + employee_address
				+ ", employee_designation=" + employee_designation + ", employee_shopid=" + employee_shopid + "]";
	}
	
	
	
}
