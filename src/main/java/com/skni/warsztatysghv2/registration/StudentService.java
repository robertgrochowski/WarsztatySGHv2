package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final UUIDStudentIdGenerator studentIdGenerator;

    public StudentService(UUIDStudentIdGenerator studentIdGenerator) {
        this.studentIdGenerator = studentIdGenerator;
    }

    public Student create(StudentRequest studentRequest) {
        String id = studentIdGenerator.getNext();
        String firstName = studentRequest.getFirstName();
        String lastName = studentRequest.getLastName();
        RegistrationStatus status = RegistrationStatus.ACCEPTED;
        return new Student(id, firstName, lastName, status);
    }

}
