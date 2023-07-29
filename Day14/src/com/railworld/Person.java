package com.railworld;

import java.sql.Date;

public class Person {
	
	public String name;
	
	
	public int age;
	
	
	public String address;
	
	
	public String gender;
	
	public Date dob;
	
	public Person() {
		
	}

	public Person(String name, int age, String address, String gender, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + ", dob=" + dob
				+ "]";
	}
	
	

}

