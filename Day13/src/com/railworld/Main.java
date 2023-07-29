package com.railworld;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.sql.Date;

public class Main {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LocalDate  localdate = LocalDate.now();
//		
//		String str = localdate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//		System.out.println(str); 
		
		
		  Scanner sc =    new Scanner(System.in);
	        
	         System.out.println("Enter the name of person");
	        
	           String  name = sc.next();
	           
	           System.out.println("Enter ID ");
	           int id = sc.nextInt();
	           
	           System.out.println("Enter the date Pattern   yyyy-MM-dd");
	           String date = sc.next();
	           
	           System.out.println("Enter Salary ");
	           double salary = sc.nextDouble();
	           
//	           System.out.println("Enter the date Pattern   yyyy-MM-dd");
//	           String date = sc.nextLine();
//	           
	           LocalDate lDate =  LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	            Date d1 = Date.valueOf(lDate);
	            
	            Employee em = new Employee(name , id , d1 ,salary);
	            
	            System.out.println(em);
	            
	            
	              
	           
	           
 
		
		
 
	}

}

