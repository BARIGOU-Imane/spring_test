package com.tp2.repository;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.tp2.model.Student;

@Repository
public interface StudentRepository{
	public Student save(Student student);
	public Student findById(int id);
	public List<Student> findAll();
}
