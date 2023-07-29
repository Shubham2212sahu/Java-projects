package com.railworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Student , Parents> m1 = new HashMap<>();
		
		
		Student st =( new Student("Shubham",1,"male",22));
		Parents pr =( new Parents("Abhi",49,"male"));
		
		m1.put(st,pr);
		
		m1.put(new Student("Shubham",1,"male",22),new Parents("jay",49,"male"));
		m1.put(new Student("yashwant",2,"male",22),new Parents("jayesh",59,"male"));
		
		Set<Student> keys = m1.keySet();
		
		for(Student key : keys) {
			System.out.println(key);
		}
		
		Set<Entry<Student, Parents>> setem = m1.entrySet();
		
		for(Entry<Student,Parents> ky : setem) {
		
		  
		 System.out.println(ky.getKey()+" "+ky.getValue());
		 
		 
		}
		
		 
			 
			
		
		
		
		
		
		
		
		

	}

}

