package com.railworld.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	
	
    public static Connection getConnection() {
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	
    	 Connection con= null;
    	
    	
    	
    	 try {
		   con =	DriverManager.getConnection("jdbc:mysql://localhost:3307/dbBatch2", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	
    	return con;
    }
}
