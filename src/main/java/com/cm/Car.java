package com.cm;

import org.springframework.stereotype.Component;

@Component()
public class Car implements Vehicle {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void drive() {
		System.out.println("Driving car...");
	}
}
