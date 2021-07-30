package com.spring.example.helloworld.service;

import org.springframework.stereotype.Component;

import com.spring.example.helloworld.model.HelloWorld;

@Component
public class BusinessService {

	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
}
