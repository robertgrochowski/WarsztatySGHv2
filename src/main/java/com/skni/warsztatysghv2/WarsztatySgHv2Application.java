package com.skni.warsztatysghv2;

import com.skni.warsztatysghv2.registration.Student;
import com.skni.warsztatysghv2.registration.StudentRequest;
import com.skni.warsztatysghv2.registration.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarsztatySgHv2Application {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentRequest studentRequest = new StudentRequest("Maciej", "Milewski");
        Student student = studentService.create(studentRequest);
        System.out.println(student);
//        SpringApplication.run(WarsztatySgHv2Application.class, args);
    }

}
