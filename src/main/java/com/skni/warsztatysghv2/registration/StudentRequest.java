package com.skni.warsztatysghv2.registration;

public class StudentRequest {

    public StudentRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private final String firstName;
    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
