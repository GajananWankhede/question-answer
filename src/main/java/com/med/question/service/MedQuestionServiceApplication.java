package com.med.question.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan({"com.med.question.service.*"})
public class MedQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedQuestionServiceApplication.class, args);
    }

}
