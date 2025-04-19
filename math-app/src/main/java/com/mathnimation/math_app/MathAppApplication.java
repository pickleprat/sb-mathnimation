package com.mathnimation.math_app;
// commenting for commit 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MathAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting springboot application....");
		SpringApplication.run(MathAppApplication.class, args);
	}

}
