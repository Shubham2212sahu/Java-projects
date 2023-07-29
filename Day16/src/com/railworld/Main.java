package com.railworld;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Myinterface my = new Myinterface() {
//
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				System.out.println("using anynous inner class ");
//				
//			}
//			
//		};
//		my.fun();
		
		//predicate
		
		
//		Predicate<Student> p1 = i -> (i.getMarks()>500)? true :false;
//		
//		boolean b1 =p1.test(new Student("Shubham",25,500,"female"));
//		
//		System.out.println(b1);
//		
//		
//		//List of student
//		
//		List<Student> st = new  ArrayList<>();
//		st.add(new Student("Shubham",25,500,"female"));
//		st.add(new Student("Jiya",29,450,"male"));
//		st.add(new Student("Riya",24,600,"female"));
//		st.add(new Student("Anshu",26,700,"female"));
//		
		
		//get student only above 500
		
		//stream
//		Stream<Student> stream = st.stream();
//		
//		Stream <Student> ss1 = stream.filter(s ->{
//		
//		if(s.getMarks()>500) {
//			return true;
//			
//		}else {
//			return false;
//		}
//		
//		});	
		
		
		
//		List<Student> st1 = st.stream()
//		.filter(s-> (s.getMarks() > 500)? true:false)
//		.toList();
//		
//		for(Student s : st1) {
//			System.out.println(s);
//			
//			
//			
//		}
		
		//consumer
		
//		Consumer<Student> c =(Student s) ->{
//			System.out.println("this is using consumer interface" + s.toString());
//			
//			
//		};
//		c.accept(new Student("Shubham",25,500,"female"));
//		
//		List<Student> st = new  ArrayList<>();
//		st.add(new Student("Shubham",25,500,"female"));
//		st.add(new Student("yashwant",29,450,"male"));
//		st.add(new Student("Riya",24,600,"female"));
//		st.add(new Student("Ashu",26,700,"female"));
//		
//		
//		st.forEach(System.out::println);
//		
		
		//supplier
		
//		Supplier<Student> s = () -> {
//			return new Student("Shubham",25,500,"female");
//			
//			
//			
//			
//		};
//		
//		Student st1 = s.get();
//	
//		System.out.println(st1);
//		
//		List<Student> st = new  ArrayList<>();
//		st.add(new Student("Shubham",25,500,"female"));
//		st.add(new Student("Ashu",29,450,"male"));
//		st.add(new Student("Riya",24,600,"female"));
//		st.add(new Student("aashi",26,700,"female"));
//		
//		st.forEach(System.out::println);
//		
		
		
		Function<Student , Employee> f = (Student s1) ->{
			
			Employee emp = new Employee();
			
			emp.setEmname(s1.getName());
			emp.setEmid(s1.getRollno());
			emp.setSalary((s1.getMarks()/1000.0)*30000);
			return emp;
			
			
			
		};
		
		Employee emp =f.apply(new Student("Shubham",25,500,"female"));
		System.out.println(emp);
		
		List<Student> st = new  ArrayList<>();
		st.add(new Student("Ashu",25,500,"female"));
		st.add(new Student("yash",29,450,"male"));
		st.add(new Student("riya",24,600,"female"));
		st.add(new Student("aashita",26,700,"female"));
		
		st.stream()
		.map(f)
		.forEach(System.out::println);
		
		

	}

}

