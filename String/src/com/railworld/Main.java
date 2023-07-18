package com.railworld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em1 = new Employee("Shubham", 37, 25, 35000.22);
		Employee em2 = new Employee("Shubham", 37, 25, 35000.22);
		Employee em3 = new Employee("Shubham", 37, 25, 35000.22);
		
	
		System.out.println(em1 == em3);
		System.out.println(em1.equals(em3));
		System.out.println(em1);
		System.out.println(em2);
	}

}
