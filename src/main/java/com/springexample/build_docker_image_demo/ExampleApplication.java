package com.springexample.build_docker_image_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		System.out.println("Running on java " + System.getProperty("java.version"));
		SpringApplication.run(ExampleApplication.class, args);
	}
}
