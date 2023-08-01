package com.railworld.dao;

import java.sql.SQLException;

import com.railworld.exception.StudentException;
import com.railworld.model.Student;

public interface StudentDao {
	public String addStudent(Student st)throws SQLException;
	public Student getStudentById(int id)throws SQLException, StudentException;
}
