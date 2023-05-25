package com.tp2;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tp2.model.Student;
import com.tp2.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Tp2Application {

	public static  void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        StudentService studentService = context.getBean(StudentService.class);

        // Utilisation des méthodes du StudentService
        Student student = new Student(1,"Imane","BARIGOU",22);
        studentService.saveStudent(student);
        Student retrievedStudent = studentService.getStudentById(1);
        List<Student> allStudents = studentService.getAllStudents();
        
     // Afficher les étudiants récupérés
        System.out.println("Liste des étudiants :");
        for (Student student1 : allStudents) {
            System.out.println(student1.getId() + " - " + student1.getFirstName());
        }

        // Afficher un étudiant spécifique
        System.out.println("Étudiant récupéré :");
        System.out.println("ID : " + retrievedStudent.getId());
        System.out.println("Nom : " + retrievedStudent.getFirstName());

	}

}
