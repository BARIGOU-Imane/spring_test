package com.tp2.repository;

import java.util.ArrayList;
import java.util.List;

import com.tp2.model.Student;

public class InMemoryStudentRepository implements StudentRepository{
    private List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

}
