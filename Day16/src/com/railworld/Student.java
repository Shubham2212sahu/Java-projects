package com.railworld;

public class Student {
	
	public String name;
	
	public int rollno;
	
	public int marks;
	
	public String gender;
	
	public Student() {
		
	}

	public Student(String name, int rollno, int marks, String gender) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + ", gender=" + gender + "]";
	}
	
	

}

