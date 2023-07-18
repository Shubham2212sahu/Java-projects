package com.railworld;

public class Animal {
	
	String name;
	int nooflegs;
	String color;
	String gender;
	
	public Animal() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNooflegs() {
		return nooflegs;
	}

	public void setNooflegs(int nooflegs) {
		this.nooflegs = nooflegs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Animal(String name, int nooflegs, String color, String gender) {
		super();
		this.name = name;
		this.nooflegs = nooflegs;
		this.color = color;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", nooflegs=" + nooflegs + ", color=" + color + ", gender=" + gender + "]";
	}
	
	

}
