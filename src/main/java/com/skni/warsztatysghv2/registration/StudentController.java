package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

@Component
public class StudentController {

    private final StudentService studentService;
    private final StudentRequest studentRequest;

    public StudentController(StudentService studentService, StudentRequest studentRequest) {
        this.studentService = studentService;
        this.studentRequest = studentRequest;
    }

    public Student createUser() {
        return studentService.create(studentRequest);
    }

}
