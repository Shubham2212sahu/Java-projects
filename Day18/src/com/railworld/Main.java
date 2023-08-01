package com.railworld;

import java.sql.SQLException;
import java.util.Scanner;

import com.railworld.dao.StudentDao;
import com.railworld.dao.StudentDaoImpl;
import com.railworld.exception.StudentException;
import com.railworld.model.Student;

public class Main {

	public static void main(String[] args) {

	             
			
			   Scanner sc = new Scanner(System.in);
			   
			   
//			   System.out.println("Enter the student Name");
//			      String eName = sc.nextLine();
//			      
//			      
//			   System.out.println("Enter the age");
//			   int age = sc.nextInt();
//			   
//			   
//			     Student std = new Student();
//			     std.setsName(eName);
//			     std.setsAge(age);
//			   
//			     
//			     
//			     
//			     // Dao
//			     
//			       // loose coupling 
//			     StudentDao  empDao = new StudentDaoImpl();
//			       
//			        try {
//					    String result =	empDao.addStudent(std);
//					    System.out.println(result);
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
			        
			     // get Student By id
				      
				      System.out.println("Enter the id of student");
				      int id = sc.nextInt();
				      
				      
				      // Dao 
				      
				       StudentDao stdDao = new StudentDaoImpl();
				       
				         try {
						       Student std =	stdDao.getStudentById(id);
						       
						        System.out.println(std);
						} catch (SQLException | StudentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			
				      // Delete Student By id
					      
					      System.out.println("Enter the id of student");
					      int id = sc.nextInt();
					      
					      
					      // Dao 
					      
					       StudentDao studDao = new StudentDaoImpl();
					       
					         try {
							       Student std =	studDao.deleteStudentById(id);
							       
							        System.out.println(std);
							} catch (SQLException | StudentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}        

	}

}
