package com.railworld;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter person name");
		String name = scn.nextLine();
		
		System.out.println("Enter person age");
		int age = scn.nextInt();
		scn.nextLine();
		
		System.out.println("Enter person gender");
		String gender = scn.nextLine();
		
		PersonClass p = new PersonClass();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		
		
		System.out.println(p);
	}

}
