package com.railworld;

import java.sql.Date;

public class Employee {
	
	public String name;
	
	public int id;
	
	public Date dob;
	
	public double salary;
	
	public Employee() {
		
	}

	public Employee(String name, int id, Date dob, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dob=" + dob + ", salary=" + salary + "]";
	}
	
	
	
	

}

