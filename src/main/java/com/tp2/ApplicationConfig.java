package com.tp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tp2.repository.InMemoryStudentRepository;
import com.tp2.repository.StudentRepository;
import com.tp2.service.StudentService;
import com.tp2.service.StudentServiceImp;

@Configuration
public class ApplicationConfig {
    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImp(studentRepository);
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}

