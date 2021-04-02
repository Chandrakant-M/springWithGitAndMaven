package com.cm;

import org.springframework.stereotype.Component;

/*
 *  This is the class of which spring makes an object - annotation method.
 *  should be in the base-package attribut of context:component-scan element in spring conf xml file
*/
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
