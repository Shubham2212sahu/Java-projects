package com.railworld;

public class Demo {
	public static void main(String[] args) {
		AnimalInterface a = new Dog();
		a.eat();
		a.sleep();
		a.noise();
		
		a = new Cat();
		a.eat();
		a.sleep();
		a.noise();
		
		a = new Elephant();
		a.eat();
		a.sleep();
		a.noise();
	}
}
