package com.railworld;

import java.util.Objects;

public class Employee {
	String name;
	int id;
	int age;
	double salary;
	
	//Getters And Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Constructor
	public Employee(String name, int id, int i, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = i;
		this.salary = salary;
	}

	//Hashcode, equals
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
//	tostring method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
