package com.cm;

import org.springframework.stereotype.Component;

/*
 *  This is the class of which spring makes an object - annotation method.
 *  should be in the base-package attribut of context:component-scan element in spring conf xml file
*/
@Component()
public class Car implements Vehicle {
	
	private Tyre tyre;

	public Car(Tyre tyre) {
		this.tyre = tyre;
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
