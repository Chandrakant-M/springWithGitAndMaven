package com.cm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Car car;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		

		car = (Car) context.getBean("car");
		car.drive();
		
		System.out.println("App:main() complete");
	}
}