package com.railworld;

public interface AnimalInterface {
	
	public default void info() {
		System.out.println("This is animal clsaa");
	}
	
	void sleep();
	void eat();
	void noise();
	
                
	
	
}
