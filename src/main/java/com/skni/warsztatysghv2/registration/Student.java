package com.skni.warsztatysghv2.registration;

public class Student {

    public Student(String id, String firstName, String lastName, RegistrationStatus status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    private String id;
    private String firstName;
    private String lastName;
    private RegistrationStatus status;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                '}';
    }
}
