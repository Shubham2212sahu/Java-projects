package com.railworld;

import java.util.Objects;

public class Student {
	
	private String sname;
	
	private int rollno;
	
	private String gender;
	
	private int age;
	
	public Student() {
		
	}

	public Student(String sname, int rollno, String gender, int age) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.gender = gender;
		this.age = age;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, rollno, sname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(gender, other.gender) && rollno == other.rollno
				&& Objects.equals(sname, other.sname);
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", gender=" + gender + ", age=" + age + "]";
	}
	

}
