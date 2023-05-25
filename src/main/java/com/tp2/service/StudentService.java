package com.tp2.service;

import java.util.List;

import com.tp2.model.Student;


public interface StudentService {
	public Student saveStudent(Student student);
	public Student getStudentById(int id);
	public List<Student>  getAllStudents();

}
