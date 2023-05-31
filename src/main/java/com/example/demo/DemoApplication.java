package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
   @ComponentScan({"com/example/demo/servlets", "com/example/dem"})
   если у тебя класс находиться в других папках и не в корневой паке com/example/demo
   то тебе надо указать такую аннотацию
 */
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
