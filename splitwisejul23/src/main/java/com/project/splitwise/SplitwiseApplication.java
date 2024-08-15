package com.project.splitwise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {


    @Override
    public void run(String... args){
        System.out.println("Application started!");
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
        // ...
    }

}
