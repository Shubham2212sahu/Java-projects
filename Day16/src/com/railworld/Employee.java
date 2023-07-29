package com.railworld;

public class Employee {
	
	public String emname;
	
	
	public int emid;
	
	public double salary;
	
	public Employee() {
		
	}

	public Employee(String emname, int emid, double salary) {
		super();
		this.emname = emname;
		this.emid = emid;
		this.salary = salary;
	}

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emname=" + emname + ", emid=" + emid + ", salary=" + salary + "]";
	}
	
	

}

