package com.railworld.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.railworld.exception.StudentException;
import com.railworld.model.Student;
import com.railworld.utility.JDBCConnection;

public class StudentDaoImpl implements StudentDao{
	
	private Connection con;
	

	public StudentDaoImpl() {
		this.con = JDBCConnection.getConnection();
	}


	@Override
	public String addStudent(Student st) throws SQLException {
		// TODO Auto-generated method stub
		

//	     PreparedStatement  ps =  con.prepareStatement("INSERT INTO employee(eName, eAge, eSalary) Values('"+emp.geteName()+"', "+emp.geteAge()+", "+emp.geteSalary()+")");
		
	        PreparedStatement ps =  con.prepareStatement("INSERT INTO student(sName, sAge)  Values(?, ?)");
	        
	        ps.setString(1, st.getsName());
	        ps.setInt(2, st.getsAge());
	        
	   
	    int x =   ps.executeUpdate();
	    
	    if(x > 0) {
	    	 return "data is saved in database";
	    }
		
		return "Not saved in the database";
	
	}


	@Override
	public Student getStudentById(int id) throws SQLException, StudentException {
		 PreparedStatement ps =   con.prepareStatement("SELECT * FROM student s WHERE s.sId = ? ");
	     
	     ps.setInt(1, id);
	     
	       ResultSet  rs =    ps.executeQuery();
	       
	       
	     if( rs.next()) {
//	    	    int stId =   rs.getInt("sId");
//	    	     String name = rs.getString("sName");
//	    	      int age =  rs.getInt("sAge");
//	    	      
//	    	      
//	    	      
//	    	    Employee emp =       new Employee(empId, name, age, salary);
	    	 
	    	 
	    	        
	         return  new Student(rs.getInt("sId"), rs.getString("sName"),
   	    		  rs.getInt("sAge"));
	     		}else {
	     		throw new StudentException("There is no employee with this id : "+ id);
     }
	}

}
