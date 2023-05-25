package com.tp2.service;

import java.util.ArrayList;
import java.util.List;

import com.tp2.model.Student;

public class StudentServiceMock implements StudentService{
    private List<Student> students = new ArrayList<>();

    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

}
