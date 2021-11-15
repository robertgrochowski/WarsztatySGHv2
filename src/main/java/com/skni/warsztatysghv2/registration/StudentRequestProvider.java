package com.skni.warsztatysghv2.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentRequestProvider {

    @Bean
    StudentRequest studentRequest() {
        return new StudentRequest("Maciej", "Milewski");
    }

}
