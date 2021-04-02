package com.cm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Car car;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/* This App class doesn't have to create the bike or car object.That is managed by spring. 
		 * Therefore, this code is not dependent on any changes in car or bike implementation. This is Dependency Injection.
	 	
		 * In the annotation method, spring looks for class with name bike/Bike(etc case-insensitive) in 
		 *   the base-package mentioned in the context:component-scan element
 		*/
		car = (Car) context.getBean("car");
		car.drive();
		
		System.out.println("App:main() complete");
	}
}