package com.cm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Vehicle vehicle;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		vehicle = (Vehicle) context.getBean("bike");
		vehicle.drive();
		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println(tyre);
		
		System.out.println("App:main() complete");
	}
}