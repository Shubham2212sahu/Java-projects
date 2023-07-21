package com.railworld;

public class PersonClass {
	private int age;
	private String name;
	private String gender;
	public int getAge() {
		return age;
	}
	//Source Elements
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public PersonClass(int age, String name, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public PersonClass() {
		super();
	}
	@Override
	public String toString() {
		return "PersonClass [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
