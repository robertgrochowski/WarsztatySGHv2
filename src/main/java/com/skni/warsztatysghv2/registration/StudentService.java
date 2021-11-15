package com.skni.warsztatysghv2.registration;

public class StudentService {

    private final UUIDStudentIdGenerator studentIdGenerator = new UUIDStudentIdGenerator();

    public Student create(StudentRequest studentRequest) {
        String id = studentIdGenerator.getNext();
        String firstName = studentRequest.getFirstName();
        String lastName = studentRequest.getLastName();
        RegistrationStatus status = RegistrationStatus.ACCEPTED;
        return new Student(id, firstName, lastName, status);
    }

}
