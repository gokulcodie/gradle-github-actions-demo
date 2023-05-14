package com.example.gradlegithubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GradleGithubActionsDemoApplication {
    @GetMapping("Welcome")
    public String greet(){
        return "Welcome to Gradle Docker Deployed app";
    }
    public static void main(String[] args) {
        SpringApplication.run(GradleGithubActionsDemoApplication.class, args);
    }

}
