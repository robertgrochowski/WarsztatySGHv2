package com.skni.warsztatysghv2;

import com.skni.warsztatysghv2.registration.StudentController;
import com.skni.warsztatysghv2.registration.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class WarsztatySgHv2Application {

    private final StudentController studentController;

    public WarsztatySgHv2Application(StudentController studentController) {
        this.studentController = studentController;
    }

    public static void main(String[] args) {
        SpringApplication.run(WarsztatySgHv2Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() {
        Student user = studentController.createUser();
        System.out.println(user);
    }

}
