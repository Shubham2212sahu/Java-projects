package in.railworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionMain {

	public static void main(String[] args) {
		
//		ArrayList<Person> al = new ArrayList<>();
//		al.add(new Person(1, 23, "Shubham"));
//		al.add(new Person(2, 22, "Shubhangi"));
//		al.add(new Person(3, 20, "Shubhanshu"));
//		
//		Person p1 = new Person(4, 35, "Abhishek");
//		al.add(p1);
//		
//		al.remove(0);
//		System.out.println(" ");
//		
//		//Enhanced for Loop
//		for(Person p :al) {
//			System.out.println(p);
//			
//			System.out.println(" ");
//		
//		//Normal for loop
//		for(int i = 0; i<al.size();i++) {
//			System.out.println(al.get(i));
//		}	
//		System.out.println(" ");
//		
//		//Iterator,
//		Iterator<Person> i = al.iterator();
//		 while(i.hasNext()) {
//			 System.out.println(i.next());
//		 }
//		 System.out.println(" ");
//		 
//		//for-each
//		 al.forEach(per ->System.out.println(per));
//		 
//		}
//		Stack<Student> st = new Stack<>();
//		st.push(new Student(1, 12,"abc"));
//		st.push(new Student(2, 15,"efg"));
//		st.push(new Student(3, 18,"hij"));
//		
//		while(! st.isEmpty()) {
//			Student stu = st.pop();
//			System.out.println(stu);
//		}
//		
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> al = new ArrayList<>();
		
		for(int i = 0; i<5; i++) {
			
		System.out.println("Enter name:");
		String name = scn.nextLine();
		
		System.out.println("Enter rollno:");
		int rollno = scn.nextInt();
		
		System.out.println("Enter age:");
		int age = scn.nextInt();
		
		scn.nextLine();
		
		
		al.add(new Student(rollno, age, name));
		
		}
//		Iterator<Student> i = al.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
			
			for(Student st :al) {
				System.out.println(st);
				
				System.out.println(" ");	
		}
	}
}




