package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("git test1");
		System.out.println("git test2 branch branch commit");
		// master test
		System.out.println("git test2 branch branch commit 33");
	}
}
