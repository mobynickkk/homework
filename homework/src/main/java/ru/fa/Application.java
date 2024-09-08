package ru.fa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ru.fa"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}