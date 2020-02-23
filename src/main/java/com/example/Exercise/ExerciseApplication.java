package com.example.Exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);
	}

}
