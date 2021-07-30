package com.spring.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.example.helloworld.model.HelloWorld;
import com.spring.example.helloworld.service.BusinessService;

@SpringBootApplication
public class HelloworldApplication {

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		PrintHelloWorld();
	}

	public static void PrintHelloWorld() {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}

}
