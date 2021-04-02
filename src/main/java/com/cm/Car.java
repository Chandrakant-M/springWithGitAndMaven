package com.cm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 *  This is the class of which spring makes an object - annotation method.
 *  should be in the base-package attribut of context:component-scan element in spring conf xml file
*/
@Component()
public class Car implements Vehicle {
	
	// when we set this annotation, spring will know that it should create an object for this class (using using xml or annotation)
	@Autowired
	private Tyre tyre;

	public Car() {
		System.out.println("car ctor called");
	}
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void drive() {
		System.out.println("Driving car...   Tyre:"+tyre);
	}

}
