package com.railworld;

public interface Myinterface {
	
	public void fun();
	
	public static void info() {
		
	}
	default String funA() {
		return "this is the default method of Myinterface";
	}

}

