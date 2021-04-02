package com.cm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Vehicle vehicle;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/* This App class doesn't have to create the bike or car object.That is managed by spring. 
		 * Therefore, this code is not dependent on any changes in car or bike implementation. This is Dependency Injection.
	 	
		 * In the annotation method, spring looks for class with name bike/Bike(etc case-insensitive) in 
		 *   the base-package mentioned in the context:component-scan element
 		*/
		vehicle = (Vehicle) context.getBean("bike");
		vehicle.drive();
		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println(tyre);
		
		System.out.println("App:main() complete");
	}
}