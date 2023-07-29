package com.railworld;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> person=new ArrayList <>();
		for(int i = 0 ;i<4; i++) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the name: ");
			String name = sc.next();
			
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the address: ");
			String address = sc.nextLine();
			
			System.out.println("Enter the gender: ");
			String gender = sc.next();
			
			System.out.println("Enter the dob in pattern:  dd-MM-yyyy");
			String date = sc.next();
			
			LocalDate lDate =  LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            Date d1 = Date.valueOf(lDate);
            
            person.add(new Person(name,age,address,gender,d1));
            
            
            
    
			
			
			
		}
		for(Person p1: person) {
			System.out.println(p1);
			
		}
		
			
		
	  
		

	}

}
