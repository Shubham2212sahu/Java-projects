package com.railworld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("Enter color :");
		String color = sc.nextLine();
		
		System.out.println("Enter gender :");
		String gender = sc.nextLine();
		
		System.out.println("Enter nooflegs :");
		int nooflegs = sc.nextInt();
		
		Animal a1 = new Animal();
		
		a1.setName(name);
		a1.setNooflegs(nooflegs);
		a1.setGender(gender);
		a1.setColor(color);
		System.out.println(a1);
	}

}
