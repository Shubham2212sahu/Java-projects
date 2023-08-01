package com.railworld.model;

public class Student {
	
	public int stId;
	public String sName;
	public int sAge;
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	
	public Student(int stId, String sName, int sAge) {
		super();
		this.stId = stId;
		this.sName = sName;
		this.sAge = sAge;
		
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	public Student() {
		super();
	}
	
	
	
	
	
}
