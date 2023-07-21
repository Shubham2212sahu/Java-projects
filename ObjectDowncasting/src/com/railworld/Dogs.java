package com.railworld;

	public class Dogs extends MainAnimal {
	    @Override
	    void eat() {
	        System.out.println("eating bread...");
	    }

	    // Specific method of the child class
	    void bark() {
	        System.out.println("barking...");
	    }
	}


