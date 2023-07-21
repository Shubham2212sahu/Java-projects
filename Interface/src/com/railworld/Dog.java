package com.railworld;

public class Dog implements AnimalInterface {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog sleeps in hut");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats bone");
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
	}

}
