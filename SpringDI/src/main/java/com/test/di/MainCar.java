package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCar {
	public static void main(String[] args) {
	
	AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:Car.xml");
	Car car1=ctx.getBean("car",Car.class);
	car1.drive();
	}
}
