package com.railworld;

public class Cat implements AnimalInterface{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cat sleeps in couch");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cat eats fish");
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("cat meows");
	}

}
